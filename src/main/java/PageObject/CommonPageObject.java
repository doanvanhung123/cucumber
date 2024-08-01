package PageObject;

import PageUI.CommonPageUI;
import commons.BasePage;
import org.openqa.selenium.WebDriver;

public class CommonPageObject extends BasePage {
    WebDriver driver;

    public CommonPageObject(WebDriver driver){
        this.driver = driver;
    }
    public void inputToDynamicTextBox(WebDriver driver,String fieldName,String value) {
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX,fieldName);
        sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX,value,fieldName);
    }

    public void inputToDynamicTextarea(WebDriver driver,String fieldName,String value) {
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTAREA,fieldName);
        sendkeyToElement(driver, CommonPageUI.DYNAMIC_TEXTAREA,value,fieldName);
    }

    public void clickToDynamicButton(WebDriver driver,String fieldName) {
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON,fieldName);
        clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON,fieldName);
    }

    public void selectToDynamicDropdown(WebDriver driver, String fieldName, String itemValue) {
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_DROPDOWN_BY_NAME,fieldName);
        selectItemInDefaultDropdown(driver, CommonPageUI.DYNAMIC_DROPDOWN_BY_NAME,itemValue,fieldName);
    }

    public void clickToDynamicRadioButton(WebDriver driver, String radioLabel) {
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_RADIO,radioLabel);
        checkToDefaultCheckBoxOrRadio(driver, CommonPageUI.DYNAMIC_RADIO,radioLabel);
    }

    public void clickToDynamicCheckBox(WebDriver driver, String checkboxLabel) {
        waitForElementClickable(driver, CommonPageUI.DYNAMIC_CHECKBOX_BY_LABEL,checkboxLabel);
        clickToElement(driver, CommonPageUI.DYNAMIC_CHECKBOX_BY_LABEL,checkboxLabel);
    }

    public String getTextboxValue(WebDriver driver, String textboxID) {
        waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX,textboxID);
        return getElementAttribute(driver, CommonPageUI.DYNAMIC_TEXTBOX,"value",textboxID);
    }
}
