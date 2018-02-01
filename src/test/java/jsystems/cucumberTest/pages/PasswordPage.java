package jsystems.cucumberTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPage extends HelperPage {

   // WebDriver driver;

    public PasswordPage(WebDriver driver){
       super(driver);
    }

        public WebElement passwordInput = driver.findElement(By.id("password"));
    public WebElement buttonLogIn = driver.findElement(By.xpath("//*[@id=\"primary\"]/div/main/div/div[1]/div/form/div[1]/div[2]/button"));



}
