package sourceDemo.stepDefinitions;

import PageObject.CommonPageObject;
import PageObject.PageGeneratorManager;
import cucumberOptions.Hooks;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CommonPageSteps {
    WebDriver driver;
    CommonPageObject commonPageSteps;

    public CommonPageSteps() {
        this.driver = Hooks.openAndQuitBrowser();
        commonPageSteps = PageGeneratorManager.getCommonPage(driver);
    }

    @When("^Click to \"(.*)\" radio button$")
    public void click_to_radio_button(String radio) {
        commonPageSteps.clickToDynamicRadioButton(driver, radio);
    }


    @When("^Input to \"(.*)\" textarea with value \"(.*)\"$")
    public void input_to_textarea(String textName, String value) {
        commonPageSteps.inputToDynamicTextarea(driver, textName, value);
    }

    @When("^Input to \"(.*)\" textbox with value \"(.*)\"$")
    public void input_to_textbox(String textName, String value) {
        commonPageSteps.inputToDynamicTextBox(driver, textName, value);
    }

    @When("^Input (aa|bb|cc) to abcd$")
    public void input_aa_bb(){

    }

}
