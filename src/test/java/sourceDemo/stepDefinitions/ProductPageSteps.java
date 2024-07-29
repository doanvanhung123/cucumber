package sourceDemo.stepDefinitions;

import PageObject.PageGeneratorManager;
import PageObject.ProductPageObject;
import cucumberOptions.Hooks;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProductPageSteps {

    WebDriver driver;

    ProductPageObject productPage;
    public ProductPageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        productPage = PageGeneratorManager.getProductPageObject(driver);
    }

    @Then("Login successfully")
    public void login_successfully() {
        Assert.assertTrue(productPage.isProductPageDisplayed());
    }
}
