package urlGenerator;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIDefinition {

  //ENVIRONMENTS
  @GET("/wwwcd/infrastructure/{environment}.yml")
  Call<String> getEnvironmentYML(@Path("environment") String environment);
}
