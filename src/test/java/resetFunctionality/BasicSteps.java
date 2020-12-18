package resetFunctionality;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSteps {

    WebDriver driver;

    @Given("Open the Chrome and launch the application")
    public void openTheChromeAndLaunchTheApplication() throws Throwable  {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver87");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @When("Enter the Username {string} and Password {string}")
    public void enterTheUsernameUsernameAndPasswordPassword(String username, String password) throws Throwable  {
        driver.findElement(By.name("uid")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @Then("Reset the credential")
    public void resetTheCredential()throws Throwable  {
        driver.findElement(By.name("btnReset")).click();
    }
}
