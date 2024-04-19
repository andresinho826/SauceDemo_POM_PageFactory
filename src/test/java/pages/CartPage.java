package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
    WebDriver driver;

    @FindBy(className = "title")
    private WebElement cartTitlePage;

    @FindBy(css = "#checkout")
    private WebElement btnCheckout;

    @FindBy(css = "#continue-shopping")
    private WebElement btnContinueShopping;
}
