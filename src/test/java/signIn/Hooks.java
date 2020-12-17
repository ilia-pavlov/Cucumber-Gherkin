package signIn;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

  public static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver87");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://grinfer.com");
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
