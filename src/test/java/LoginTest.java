import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends ConfigFrontend {

    @Test
    public void firstFrontendTest(){
        driver.get(baseUrl);
        driver.findElement(By.cssSelector("div.page-root div.hp-hero__wrapper p span"));
    }

}
