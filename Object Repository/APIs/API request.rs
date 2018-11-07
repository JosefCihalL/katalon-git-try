<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>API request</name>
   <tag></tag>
   <elementGuidId>9030e35a-3f98-4301-aead-880eafc081ef</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent></httpBodyContent>
   <httpBodyType></httpBodyType>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>GET</restRequestMethod>
   <restUrl>http://${URLE}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'internal-DVK-1-be-a-2025432293.eu-west-1.elb.amazonaws.com/auth/monitoring/ping'</defaultValue>
      <description></description>
      <id>8160ed36-124e-406e-a860-7c03bae83953</id>
      <masked>false</masked>
      <name>URLE</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import org.apache.bcel.verifier.exc.VerificationException

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

// Verification
WS.verifyResponseStatusCode(response, ${dataResponse})</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
