package day1;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class HttpReq {
	@Test
	void getUser() {
		
		given()
		 
		.when()
			.get("https://reqres.in/api/users/2")
		.then().statusCode(200) ;
	}

}
