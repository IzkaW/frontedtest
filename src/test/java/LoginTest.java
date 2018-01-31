import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends ConfigFrontend {

    @Test
    public void firstFrontendTest(){
        driver.get(baseUrl);
        driver.findElement(By.cssSelector(".hp-hero__wrapper .no-widows"));
        driver.findElement(By.xpath("//*[@id=\"navbar-login-link\"]"));
        driver.findElement(By.id("wpcom-logo"));
        driver.findElement(By.className("menu-signup"));
        driver.findElement(By.cssSelector("div.hp-hero__wrapper")).findElement(By.className("button"));
    }

}
