import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class getQoutes {

	@Test
	public void skyscannerQuotes() {
		
		given().
		header("apiKey","     ").
		header("x-rapidapi-key", "   ").
		header("x-rapidapi-host","   ").
		get("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com/apiservices/browsequotes/v1.0/BA/BAM/en-US/BELI-sky/BER-sky/2021-03-02").
		then().	
		statusCode(200).log().all();

	}


	}
	

