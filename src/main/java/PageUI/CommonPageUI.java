package PageUI;

public class CommonPageUI {
    //Patten object
    public static final String DYNAMIC_TEXTBOX = "xpath=//td[text()='%s']/following-sibling::td//input";
    public static final String DYNAMIC_TEXTAREA = "xpath=//td[text()='%s']/following-sibling::td//textarea";
    public static final String DYNAMIC_RADIO = "xpath=//input[@type='radio' and @value='%s']";
    public static final String DYNAMIC_LINK = "xpath=//a[text()='%s']";
    public static final String DYNAMIC_BUTTON = "xpath=//input[@value='%s']";
    public static final String DYNAMIC_VALUE_BY_COLUMN_NAME = "xpath=//td[contains(text(),'%s')]/following-sibling::td";


    public static final String DYNAMIC_DROPDOWN_BY_NAME = "xpath=//select[@name = '%s']";
    public static final String DYNAMIC_CHECKBOX_BY_LABEL = "xpath=//label[contains(text(),'%s')]/following-sibling::input";

}
