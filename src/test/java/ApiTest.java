import com.jayway.jsonpath.JsonPath;
import com.zebrunner.carina.core.IAbstractTest;
import io.restassured.response.Response;
import org.manumiguezz.api.products.DeleteProduct;
import org.manumiguezz.api.products.GetProduct;
import org.manumiguezz.api.products.PostProduct;
import org.manumiguezz.api.products.PutProduct;
import org.testng.annotations.Test;

public class ApiTest implements IAbstractTest {
    @Test
    public void getProductTest() {

        GetProduct getProduct = new GetProduct();
        getProduct.setIndex(99);

        Response response = getProduct.callAPIExpectSuccess();

        getProduct.validateResponseAgainstSchema("api/products/_get/rs.schema");
        JsonPath.read(response.asString(), "$.id");
    }

    @Test
    public void postProductTest() {

        PostProduct postProduct = new PostProduct();
        postProduct.setProperties("api/products/product.properties");

        postProduct.callAPIExpectSuccess();

        postProduct.validateResponse();
    }

    @Test
    public void deleteProductTest() {
        DeleteProduct deleteProduct = new DeleteProduct();
        deleteProduct.setProperties("api/products/product.properties");

        deleteProduct.callAPIExpectSuccess();

        deleteProduct.validateResponseAgainstSchema("api/products/_delete/rs.json");
    }

    @Test
    public void putProductTest() {
        PutProduct putProduct = new PutProduct();
        putProduct.setProperties("api/products/product.properties");

        putProduct.callAPIExpectSuccess();

        putProduct.validateResponseAgainstSchema("api/products/_put/rs.schema");
    }

}

