package steps;


import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    static WebDriver driver;

    @Before
    public static void openUrl(){
        driver.get("https://grinfer.com");
    }
}
