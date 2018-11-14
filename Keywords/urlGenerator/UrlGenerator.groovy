package urlGenerator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class UrlGenerator {
  private static final String CVS_SPLIT_BY = ",";
  private static final String NEW_LINE = "\n";

  private static Map<String, String> apiUrls = new HashMap<>();

  private String csvSource;
  private String baseUrl;
  private String environment;


  public UrlGenerator(String csvSource, String baseUrl, String environment) {
    this.csvSource = csvSource;
    this.baseUrl = baseUrl;
    this.environment = environment;
  }
  
  public static void main(String[] args) throws IOException {
    if (args.length != 3) {
      System.err.println("Wrong program arguments. Mandatory arguments: url-generator <csvSource> <baseUrl> <environment>");
      return;
    }
    UrlGenerator u = new UrlGenerator(args[0], args[1], args[2]);
    u.generate();
  }

  public void generate() throws IOException {
    loadURLs();
    updateCSV(loadCSV());
  }

  private void loadURLs() throws IOException {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .client(UnsafeOkHttpClient.getJWTHttpClient())
        .build();
    Response response = retrofit.create(APIDefinition.class).getEnvironmentYML(environment).execute();
    if (response.isSuccessful()) {
      ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
      Map envMap = mapper.readValue(response.body().toString(), LinkedHashMap.class);
      loadELB(envMap);
      loadEC2(envMap);
    } else {
      throw new IOException("Environment config from: " + environment + " cannot be loaded -> " + response.errorBody().string());
    }
  }

  private void loadELB(Map<String, Map<String, Map<String, String>>> map) {
    Map<String, Map<String, String>> domains = map.get("ELB");
    if (domains != null) {
      for (Object key : domains.keySet().toArray()) {
        apiUrls.put(key.toString().toLowerCase(), domains.get(key).get("URL"));
      }
    }
  }

  private void loadEC2(Map<String, Map<String, Map<String, Map<String, String>>>> map) {
    Map<String, Map<String, Map<String, String>>> ec2 = map.get("EC2");
    if (ec2 != null) {
      for (Object app : ec2.keySet().toArray()) {
        apiUrls.put(app.toString().toLowerCase(), ((Object) ec2.get(app).get("IP")).toString());
      }
    }
  }

  private StringBuilder loadCSV() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(csvSource));
    StringBuilder updatedCSV = new StringBuilder();
    String line;
    while ((line = br.readLine()) != null) {
      String[] columns = line.split(CVS_SPLIT_BY);
      updatedCSV.append(columns[0]);
      updatedCSV.append(CVS_SPLIT_BY);
      updatedCSV.append(apiUrls.get(columns[0]));
      updatedCSV.append(columns[2]);
      updatedCSV.append(CVS_SPLIT_BY);
      updatedCSV.append(columns[2]);
      updatedCSV.append(CVS_SPLIT_BY);
      updatedCSV.append(columns[3]);
      updatedCSV.append(NEW_LINE);
    }
    return updatedCSV;
  }

  private void updateCSV(StringBuilder loadCSV) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File(csvSource)));
    bw.write(loadCSV.toString());
    bw.flush();
    bw.close();
  }
}