import builder.PojoProduct;
import io.restassured.RestAssured;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class FoodTest {
    @BeforeAll
    static void beforeAll() {
    RestAssured.baseURI ="https://minimarket1.herokuapp.com/market/api/v1/products";
}

    @Order(1)
    @Test
    void addFood() {
    PojoProduct newProduct = new PojoProduct(null, "Масло", "123", "Food");
    String actual = RestAssured.given().log().all()
            .body(newProduct)
            .post()
            .asPrettyString();

    }
    @Order(2)
    @Test
    void checkFood(){
        String check = RestAssured.given().log().all()
                .when().get("/1344")
                .asPrettyString();
    }


}
