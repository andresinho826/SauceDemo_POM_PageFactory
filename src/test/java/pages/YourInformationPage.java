package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class YourInformationPage  extends BasePage{
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

    public void setYourInfoTitlePage(){
        isElementDisplayed(yourInfoTitlePage);
        Assert.assertEquals(yourInfoTitlePage.getText(), "Checkout: Your Information");
    }
    public void setBtnCancelYourInfo(){
        btnCancelYourInfo.click();
    }
    public void setBtnContinue(){
        btnContinue.click();
    }
    public void setDatos(String user, String lastName, String postalCode){
        inputName.sendKeys(user);
        inputLastName.sendKeys(lastName);
        inputPostalCode.sendKeys(postalCode);
        setBtnContinue();
    }
    public YourInformationPage(WebDriver driver){
        super(driver);
    }
}
