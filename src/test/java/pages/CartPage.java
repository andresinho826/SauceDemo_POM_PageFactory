package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CartPage  extends BasePage{
    WebDriver driver;

    @FindBy(className = "title")
    private WebElement cartTitlePage;

    @FindBy(css = "#checkout")
    private WebElement btnCheckout;

    @FindBy(css = "#continue-shopping")
    private WebElement btnContinueShopping;

    @FindBy(xpath = "//*[@id[contains(., 'remove')]]")
    private List<WebElement> btnRemoveList;

    public void setBtnRemove(){
        for (int i=0; i<=btnRemoveList.size();i++){
            /*
            if (!btnRemoveList.isEmpty()){
                btnRemoveList.get(i).click();
            }else btnContinueShopping.click();
             */


            while (btnRemoveList.size() != 0){
                btnRemoveList.get(i).click();
            }
        }
        isElementDisplayed(btnContinueShopping);
        btnContinueShopping.click();
        //Assert.assertEquals(cartTitlePage.getText(), "Products");
        //Assert.assertFalse(cartTitlePage.isDisplayed());

    }

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
