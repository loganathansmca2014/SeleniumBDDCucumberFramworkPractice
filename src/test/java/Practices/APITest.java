package Practices;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class APITest {
    public static void main(String args[])
    {
        Response response = null;

        baseURI="https://reqres.in/api";
        given().log().all().header("Content-type","application/json")
                .when().get("/users")
                        .then().log().all()
                        .statusCode(200).extract().response().toString();


        post();
    }

    public static void post()
    {
        baseURI="https://reqres.in/api";
        given().log().all().header("Contenet-Type","application/json")
                .body("{\n" +
                        "            \"email\": \"logumca2011@gmail.com\",\n" +
                        "            \"first_name\": \"Loganathan\",\n" +
                        "            \"last_name\": \"sengottaiyan\",\n" +
                        "        }")
                .when().post("/users")
                .then().log().all()
                .statusCode(201);
    }
}
