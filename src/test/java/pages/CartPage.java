package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage  extends BasePage{
    WebDriver driver;

    @FindBy(className = "title")
    private WebElement cartTitlePage;

    @FindBy(css = "#checkout")
    private WebElement btnCheckout;

    @FindBy(css = "#continue-shopping")
    private WebElement btnContinueShopping;

    public void setCartTitlePage(){

        isElementDisplayed(cartTitlePage);
        Assert.assertEquals(cartTitlePage.getText(), "Your Cart");
    }
    public void setBtnCheckout(){
        btnCheckout.click();
    }
    public void setBtnContinueShopping(){
        btnContinueShopping.click();
    }
    public CartPage(WebDriver driver){
        super(driver);
    }
}
