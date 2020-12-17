package signIn;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import signIn.pages.MainPage;

public class Steps {

    private WebDriver driver = Hooks.driver;

    MainPage mainPage = new MainPage(driver);

    @Then("Click {string} button")
    public void clickButton(String text) {
        mainPage.clickLoginInButton(text);

    }
}
