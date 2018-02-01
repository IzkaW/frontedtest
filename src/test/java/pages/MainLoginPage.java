package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class MainLoginPage extends BasePage{

    WebDriver driver;

    public MainLoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "search-component-1")

    public WebElement isContentPage;

    public boolean isContentPage(){
        assertTrue(driver.getTitle().contains(DataTest.mojastrona));
        return true;
    }

}
