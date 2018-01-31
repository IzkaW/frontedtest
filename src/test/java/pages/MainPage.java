package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    WebDriver driver;

    public MainPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, null);
    }
    public void isContentPage() {

    }
}
