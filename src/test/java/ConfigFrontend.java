import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfigFrontend {

    public WebDriver driver = null;

    //Before Class musi byc jako static
    @BeforeClass
    public static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }

    //Before bez static
    @Before
    public void setUp(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver.manage().deleteAllCookies();

        if (driver == null){
            driver = new ChromeDriver();
        }
    }

}
