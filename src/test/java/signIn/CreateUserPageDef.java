package signIn;

import confing.UserConfig;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import signIn.pages.CreateUserPage;

import static app_context.RunContext.*;

public class CreateUserPageDef {

    private final WebDriver driver = Hooks.driver;
    CreateUserPage createUserPage = new CreateUserPage(driver);

    @Then("Input email")
    public void inputEmail() {
        String email = "Auto_" + RandomStringUtils.randomAlphabetic(5) + "@gmail.com";
        createUserPage.inputEmail(email);
        put("email", email);
    }

    @Then("Input First Name")
    public void inputFirstName() {
        String firstName = UserConfig.USER_FIRST_NAME;
        createUserPage.inputFirstName(firstName);
        put("firstName", firstName);
    }

    @Then("Input Last Name")
    public void inputLastName() {
        String lastName = UserConfig.USER_LAST_NAME;
        createUserPage.inputLastName(lastName);
        put("lastName", lastName );
    }

    @Then("Verify First Name")
    public void verifyFirstName() {
        String expect = get("firstName", String.class);
        String actual = createUserPage.getFirstName();
        Assert.assertEquals(expect, actual);
    }

    @Then("Verify Last Name")
    public void verifyLastName() {
        String expect = get("lastName", String.class);
        String actual = createUserPage.getLastName();
        Assert.assertEquals(expect, actual);
    }
}
