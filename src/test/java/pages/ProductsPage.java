package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class ProductsPage extends BasePage{
    WebDriver driver;

    @FindBy(css = ".title")
    private WebElement productTitlePage;

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    private WebElement backPackProduct;


    // lista de todos los botonos de la pagina
    @FindBy(xpath = "//button[contains(@class, 'a')]")
    private List<WebElement> producList;



    @FindBy(className = "shopping_cart_link")
    private WebElement btnCart;

    @FindBy(css = "#react-burger-menu-btn")
    private WebElement menuBurguer;

    @FindBy(css = "#logout_sidebar_link")
    private WebElement btnLogOut;




    public ProductsPage(WebDriver driver){
        super(driver);
    }

    public void logOutSesion(){
        menuBurguer.click();
        btnLogOut.click();
    }



    public void setProductTitlePage(){
        //String testing = productTitlePage.getText();
        //System.out.println("PAGE PRODUCTS  ____ "+testing);
        isElementDisplayed(productTitlePage);
        Assert.assertEquals(productTitlePage.getText(), "Products");
    }
    public void setOneProducList(){
        //backPackProduct.click();

        if(!producList.isEmpty()){
            producList.get(0).click();
        }
    }
    public void setThreeProductList(){
        int numOfButtonsToClick = Math.min(3,producList.size());
        for (int i=0; i< numOfButtonsToClick; i++){
            producList.get(i).click();
        }

    }
    public void setBtnCart(){
        btnCart.click();
    }

}
