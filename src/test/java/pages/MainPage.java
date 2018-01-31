package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class MainPage extends BasePage {

    WebDriver driver;



    public MainPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".hp-hero__wrapper .no-widows")
            public WebElement titleMainPage;
    // WebElement title = driver.findElement(By.cssSelector(".hp-hero__wrapper .no-widows"));

    @FindBy(id = "wpcom-logo")
            public  WebElement logo;

    //WebElement logo = driver.findElement(By.id("wpcom-logo"));

    @FindBy(xpath = "//*[@id=\"navbar-login-link\"]")
            public WebElement loginButton;

    //WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"navbar-login-link\"]"));

    @FindBy(className = "menu-signup")
            public WebElement getGetStartedTopBar;
    //WebElement getStartedTopBar = driver.findElement(By.className("menu-signup"));

    @FindBy(css = "div.hp-hero__wrapper .is-cta")
        public WebElement getStartedMain;
    //WebElement getStartedMain = driver.findElement(By.cssSelector("div.hp-hero__wrapper")).findElement(By.className("is-cta"));

    public boolean isContentPage() {
        assertTrue(driver.getTitle().equals(DataTest.wordPressTitle));
        assertTrue(titleMainPage.isDisplayed());
        assertTrue(titleMainPage.getText().equals(DataTest.titleMainPage1));
        assertTrue(loginButton.isDisplayed());
        return true;
    }
}
