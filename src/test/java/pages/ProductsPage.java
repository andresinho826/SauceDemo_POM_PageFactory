package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage {
    WebDriver driver;

    @FindBy(css = ".title")
    private WebElement productTitlePage;

    @FindBy(className = "btn btn_primary btn_small btn_inventory")
    private List<WebElement> producList;

    @FindBy(className = "shopping_cart_link")
    private WebElement btnCart;



}
