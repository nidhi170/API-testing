package DEMO;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*
;

import Files.payload;public class Basics {

	
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://www.rahulshettyacademy.com/";
     String response= given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
      .body(payload.AddPlace()).
      when().post("/maps/api/place/add/json")
      .then().log().all()
      .assertThat().statusCode(200)
      .body("scope", equalTo("APP"))
      .header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
      
      System.out.println(response);
      JsonPath js=new JsonPath(response);
     String placeid= js.getString("place_id");
      System.out.print(placeid);
      }
	}
// add place -> Update place with new address-> Get place to validate if new address is presnt in response
