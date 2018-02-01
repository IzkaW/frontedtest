package jsystems.cucumberTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;


public class MainPage {
    WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    public String title = driver.getTitle();

    public WebElement logIn = driver.findElement(By.id("navbar-login-link"));

    public boolean isContentPresent(){
        assertTrue(logIn.isDisplayed());
        return true;

    }

}
