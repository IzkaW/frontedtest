package jsystems.cucumberTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalPage {

    WebDriver driver;

    public PersonalPage(WebDriver driver){
        this.driver = driver;
    }


    public WebElement saveProfileDetailsButton = driver.findElement(By.cssSelector(".button.form-button.is-primary"));

    public WebElement notification = driver.findElement(By.xpath("//*[@id=\"secondary\"]/ul/li[1]/ul/li[5]/a"));

}
