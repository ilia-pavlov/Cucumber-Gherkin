package signIn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import signIn.pages.MainPage;

public class StepDefs {

    WebDriver driver;

    @Given("Open Chrome browser and launch the application")
    public void openChromeBrowserAndLaunchTheApplication() throws Throwable  {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver87");
        driver= new ChromeDriver();
        driver.manage().window().maximize();

        MainPage mainPage = new MainPage(driver);
        mainPage.open();
    }

    @Then("Click {string} button")
    public void clickButton(String text) {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLoginInButton(text);

    }
}
