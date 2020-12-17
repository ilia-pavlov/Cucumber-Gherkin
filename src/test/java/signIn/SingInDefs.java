package signIn;


import confing.UserConfig;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import signIn.pages.LogInPage;


public class SingInDefs {

    private final WebDriver driver = Hooks.driver;
    LogInPage logInPage = new LogInPage(driver);

    @Then("Input login")
    public void inputLogin() {
        logInPage.loginInput(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        logInPage.passwordInput(UserConfig.USER_PASSWORD);
    }
}
