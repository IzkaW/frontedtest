package jsystems.cucumberTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPersonalPage {

    WebDriver driver;

    public MainPersonalPage(WebDriver driver){
        this.driver = driver;
    }

public WebElement avatar = driver.findElement(By.cssSelector(".masterbar__item.masterbar__item-me"));


}
