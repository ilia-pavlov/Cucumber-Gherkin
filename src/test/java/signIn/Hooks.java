package signIn;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    WebDriver driver;

    @After
    public void afterScenario(){
        driver.quit();
    }
}
