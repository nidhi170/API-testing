package DEMO;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Demo4 {
	@Test
	public void B() {
	 
		baseurl = "https://reqres.in/api";
		given().get("users?page=2").
		then().statusCode(403).
		body("data[1].id",equalTo(8));
		System.out.print("Heelloow");
		
		
		
	}
	

}
