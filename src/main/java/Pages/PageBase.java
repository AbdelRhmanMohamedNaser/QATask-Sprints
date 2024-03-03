package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;
    public PageBase(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void clickOn(WebElement element) {
        element.click();
    }
    public String getText(WebElement element) {
        return element.getText().trim();
    }


    public void clearTextBox(WebElement element) {
        element.clear();
    }
    public void setValueToTxtField( WebElement textBox, String value) {
        textBox.sendKeys(value);
    }



}
