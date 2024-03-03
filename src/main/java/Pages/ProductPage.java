package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"breadcrumbs_515\"]/div/a[5]/bdi")
    WebElement samsungTab;
    public void backToHomePage(){
        clickOn(samsungTab);
    }
    @FindBy(xpath = "//*[@class='ut2-pb__title']//bdi")
    public WebElement product;
    @FindBy(xpath = "//*[@class='ut2-icon-use_icon_cart']")
    public WebElement AddToCardBtn;
    @FindBy(xpath = "//*[@id=\"cart_icon_4700\"]/i")
    public WebElement CardIcon;
    @FindBy(xpath = "//a[@class='ty-btn ty-btn__outline']")
    public WebElement ViewCardBtn;
    @FindBy(xpath = "//*[@class='ty-cart-content__product-title']")
    WebElement TitleOfFirstItem;
    public String TitleOfFirstValue(){
        return getText(TitleOfFirstItem);
    }

}
