package signIn;


import confing.UserConfig;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import signIn.pages.SingInPage;


public class SingInPageDef {

    private final WebDriver driver = Hooks.driver;
    SingInPage singInPage = new SingInPage(driver);

    @Then("Input login")
    public void inputLogin() {
        singInPage.loginInput(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        singInPage.passwordInput(UserConfig.USER_PASSWORD);
    }

}
