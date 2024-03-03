package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageBase{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"checkout_form\"]/div[1]/div[2]/a/bdi")
    WebElement checkoutBtn;
    public void checkOutBtton(){
        clickOn(checkoutBtn);
    }
    @FindBy(xpath = "//*[@class='litecheckout__input first-name']")
    WebElement FirstAndLastName;
    @FindBy(xpath = "//*[@id=\"litecheckout_phone\"]")
    WebElement phone;


    @FindBy(xpath = "//*[@id=\"litecheckout_city\"]")
    WebElement city;
   @FindBy(xpath = "//*[@id=\"litecheckout_state\"]")
   WebElement clickonCity;
    @FindBy(xpath = "//*[@id=\"litecheckout_state\"]//option[@value='02']")
    WebElement selectCity;
    @FindBy(xpath = "//select[@id='litecheckout_country']")
    WebElement clickonCountry;
    @FindBy(xpath = "//*[@id=\"litecheckout_country\"]//option[@value='EG']")
    WebElement selectCountry;
    @FindBy(xpath = "//*[@class='litecheckout__input shipping-address']")
    WebElement address;
    @FindBy(xpath = "//*[@id=\"litecheckout_s_zipcode\"]")
    WebElement zipCode;
    @FindBy(xpath = "//input[@name='accept_terms']")
    WebElement checkbox;
    public void clickCheckBox(){
        clickOn(checkbox);
    }
    @FindBy(xpath = "//*[@id=\"litecheckout_place_order\"]")
    WebElement placeOrderBtn;
    public void clickOnPlaceOrderBtn(){
        clickOn(placeOrderBtn);
    }
    @FindBy(xpath = "//p[contains(text(),'Congratulations! Your order has been successfully ')]")
    WebElement order;
    public String getOrderStatus(){
        return getText(order);
    }


}
