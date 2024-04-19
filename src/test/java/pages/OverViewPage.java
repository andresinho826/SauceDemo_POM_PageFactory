package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverViewPage {
    WebDriver driver;

    @FindBy(className = "title")
    private WebElement overViewTitlePage;

    @FindBy(css = "#cancel")
    private WebElement btnCancelOverView;

    @FindBy(css = "#finish")
    private WebElement btnFinish;

}
