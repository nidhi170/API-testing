package DEMO;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Demo3 {

	
	@Test
	public void A() {
	Response response=	RestAssured.get("https://reqres.in/api/users?page=2");
	System.out.println(response.getStatusCode());
	System.out.println(response.getTime());
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("Content-Type"));
	
 
	
	int status=response.getStatusCode();
	Assert.assertEquals(status, 200);




		
		
	}
}
