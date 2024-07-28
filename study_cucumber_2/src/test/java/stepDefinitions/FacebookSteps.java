package stepDefinitions;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class FacebookSteps {
    WebDriver driver;
   @Before()
    public void openFacebookApp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Write code here that turns the phrase above into concrete actions
    }

    @After
    public void closeBroser(){
        driver.quit();
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

    @Then("Verify Email textbox is {string}")
    public void verify_email_textbox_is(String userName) {
        Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
    }
    @Then("Verify password textbox is {string}")
    public void verify_password_textbox_is(String password) {
        Assert.assertTrue(driver.findElement(By.id("pass")).isDisplayed());
    }

    @Then("Input user name and password")
    public void input_user_name_and_password(DataTable dataTable) {
        List<Map<String,String>> data= dataTable.asMaps(String.class,String.class);
        driver.findElement(By.id("email")).sendKeys(data.get(0).get("UserName"));
        driver.findElement(By.id("pass")).sendKeys(data.get(0).get("Password"));
    }

    @Then("Input user name {string} and password {string}")
    public void input_user_name_a_and_password_b(String a, String b) {
        driver.findElement(By.id("email")).sendKeys(a);
        driver.findElement(By.id("pass")).sendKeys(b);
    }

}
