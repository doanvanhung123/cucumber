package sourceDemo.stepDefinitions;

import PageObject.LoginPageObject;
import PageObject.PageGeneratorManager;
import cucumberOptions.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps {
    WebDriver driver;

    LoginPageObject loginPage;
    public LoginPageSteps(){
        this.driver = Hooks.openAndQuitBrowser();
        loginPage = PageGeneratorManager.getLoginPageObject(driver);
    }

    @Given("Input user name")
    public void input_user_name() {
        loginPage.enterToUserNameTextbox("standard_user");
    }
    @When("Input password")
    public void input_password() {
        loginPage.enterToPasswordTextbox("secret_sauce");
    }

    @When("Click to Login button")
    public void click_to_login_button() {
        loginPage.clickLoginButton();
    }

}
