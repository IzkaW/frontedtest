package jsystems.cucumberTest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotificationPage {

    WebDriver driver;

    public NotificationPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement firstCheckbox = driver.findElement(By.xpath("//*[@id=\"primary\"]/main/div[3]/div/div[1]/div[2]/div[2]/ul/li[1]/input"));


}
