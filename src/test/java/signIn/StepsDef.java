package signIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDef {

    WebDriver driver;

    @Given("Open Chrome browser and launch the application")
    public void openChromeBrowserAndLaunchTheApplication() throws Throwable  {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver87");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://grinfer.com");
    }

    @Then("Click {string} button")
    public void clickButton(String text) {
        String xpath = "//div[text() = '" + text + "']";

        WebElement button = driver.findElement(By.xpath(xpath));
        button.click();
    }
}
