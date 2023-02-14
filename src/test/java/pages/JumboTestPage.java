package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JumboTestPage {
    public JumboTestPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id ="onetrust-reject-all-handler" )
    public WebElement cookiBtn;

    @FindBy (xpath ="//span[text()='Mijn Jumbo']")
    public WebElement mijnJumboBtn;

    @FindBy (xpath =" //a[@class='item-link']")
    public WebElement inlogBtn;

    @FindBy (id ="username")
    public WebElement usernameTextbox;
    @FindBy (id ="password")
    public WebElement passwordTextbox;
    @FindBy (id ="submit")
    public WebElement submitBtn;
    //products menu
    @FindBy (xpath="//a[normalize-space()='Producten']")
    public WebElement products;
    @FindBy (xpath="//a[normalize-space()='Aardappelen, groente en fruit']")
    public WebElement patatoes;

    @FindBy (xpath="(//button[@data-testid='jum-button'])[12]")
    public WebElement addBtn;

}
