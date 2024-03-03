package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"login_popup4699\"]")
    WebElement userNameTxtBox;

    @FindBy(xpath = "//*[@id=\"psw_popup4699\"]")
    WebElement passwordTxtBox;

    @FindBy(xpath = "//*[@id=\"login_pass\"]/form/div[5]/div[1]/button")
    WebElement signInBtn;


    public void userLogin(String username, String password)  {
        setValueToTxtField(userNameTxtBox, username);
        setValueToTxtField(passwordTxtBox, password);
        clickOn(signInBtn);
    }




}
