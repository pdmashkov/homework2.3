package ru.netology.post;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {
    @Test
    public void shouldSendPostRequest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Что то там и зачем то еще")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Что то там и зачем то"));
    }
}
