import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ConfigFrontend {

    public WebDriver driver = null;
    public String baseUrl;
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
        baseUrl = DataTest,baseUrl;

        if (driver == null){
            driver = new ChromeDriver();
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(){
        driver.quit();
        driver.close();
        driver = null;
    }
}
