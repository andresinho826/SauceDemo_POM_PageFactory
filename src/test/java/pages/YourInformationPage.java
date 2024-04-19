package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourInformationPage {
    WebDriver driver;

    @FindBy(className = "title")
    private WebElement yourInfoTitlePage;

    @FindBy(css = "#cancel")
    private WebElement btnCancelYourInfo;

    @FindBy(css = "#continue")
    private WebElement btnContinue;


    @FindBy(css = "#first-name")
    private WebElement inputName;

    @FindBy(css = "#last-name")
    private WebElement inputLastName;

    @FindBy(css = "#postal-code")
    private WebElement inputPostalCode;
}
