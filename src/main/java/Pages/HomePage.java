package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends  PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"sw_dropdown_624\"]")
    WebElement MyAccountIcon;
    @FindBy(xpath = "//*[@id=\"dropdown_624\"]/div[3]/a[1]")
    WebElement SignInBtn;
    public void NavigateToLoginPage(){
        clickOn(MyAccountIcon);
        clickOn(SignInBtn);

    }
    @FindBy(xpath = "//input[@id='search_input']")
    WebElement searchField;
    @FindBy(xpath = "//button/i[@class='ut2-icon-search']")
    WebElement searchIcon;

    public void setValueToSearchTextField(String value){
        setValueToTxtField(searchField , value);
        clickOn(searchIcon);
    }
    @FindBy(xpath = "//*[@id=\"products_search_pagination_contents\"]/div[1]/div/form/div/div[3]/div[1]/a")
    public WebElement Item;
    public String get_Text(){
        return  getText(Item);
    }
    public void selectFirstItem(){
        clickOn(Item);
    }
    @FindBy(xpath = "//*[@id=\"content_features\"]/div/div[1]/div[2]")
    public WebElement brand;
    public String GetNameBrand(){
        return getText(brand);
    }

}
