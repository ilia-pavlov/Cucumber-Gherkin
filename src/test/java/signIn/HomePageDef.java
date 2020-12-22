package signIn;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import signIn.pages.HomePage;

public class HomePageDef {

    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);


    @Then("Click avatar button")
    public void clickAvatarButton() {
        homePage.avatarButton();
    }
}
