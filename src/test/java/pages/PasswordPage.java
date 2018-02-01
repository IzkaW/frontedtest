package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage extends BasePage{

    WebDriver driver;

    public PasswordPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"primary\"]/div/main/div/div[1]/div/form/div[1]/div[2]/button")
    public WebElement buttonLogIn;

}
