package Test;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.PageBase;
import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase extends TestBase {
    HomePage homePage;
    PageBase page;
    ProductPage product;
    CheckoutPage check;
    @Parameters({"value"})
    @Test(priority  =1)
    public void VerifyusersCanSuccessfullySearchForProducts(@Optional("Samsung") String value) {
        homePage = new HomePage(driver);
        homePage.setValueToSearchTextField(value);
        homePage.selectFirstItem();
        String Actual = homePage.GetNameBrand();
        Assert.assertEquals(Actual , value);

    }
    @Test(priority = 2)
    public void AddingItemsToTheCart() throws InterruptedException {
        page = new PageBase(driver);
        product = new ProductPage(driver);
          String Actual = page.getText(product.product);
          Thread.sleep(5000);
          page.clickOn(product.AddToCardBtn);
          Thread.sleep(7000);
          page.clickOn(product.CardIcon);
          page.clickOn(product.ViewCardBtn);
          String Expected =product.TitleOfFirstValue();
          Assert.assertEquals(Actual , Expected);


    }
    @Test(priority = 3)
    public void CompletingPurchases() throws InterruptedException {
        page = new PageBase(driver);
        product = new ProductPage(driver);
        check = new CheckoutPage(driver);
        check.checkOutBtton();
        check.clickCheckBox();
        check.clickOnPlaceOrderBtn();
        Thread.sleep(4000);
        String Actual= check.getOrderStatus();
        Assert.assertEquals(Actual ,"Congratulations! Your order has been successfully placed. Order details");
    }

}
