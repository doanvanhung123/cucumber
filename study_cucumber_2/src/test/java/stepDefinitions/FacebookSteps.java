package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookSteps {
    WebDriver driver;
    @Given("^Open facebook app$")
    public void openFacebookApp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Verify Email textbox is displayed$")
    public void verifyEmailTextboxIsDisplayed() {

        Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Verify password textbox is displayed$")
    public void verifyPasswordTextboxIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());
    }
}
