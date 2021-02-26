import org.testng.annotations.Test;

import groovyjarjarasm.asm.TypeReference;

import static io.restassured.RestAssured.*;

import io.restassured.mapper.ObjectMapper;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.util.List;


public class getQoutes {

	@Test
	public void skyscannerQuotes() {
		
		given().
		header("apiKey","dummyapiKey").
		header("x-rapidapi-key", "dummyxrapidapikey").
		header("x-rapidapi-host","dummyxrapidapihost").
		get("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/browsequotes/v1.0/BA/BAM/en-US/BELI-sky/BER-sky/2021-03-02").
		then().	
		statusCode(200).log().all();

	}

}

