package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage {

    WebDriver driver;

    @FindBy(className = "title")
    private WebElement completeTitlePage;

    @FindBy(css = "#back-to-products")
    private WebElement btnBackHome;

    @FindBy(className = "complete-header")
    private WebElement textOrderComplete;
}