package signIn;

import confing.EnvConfig;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import signIn.pages.BasicPage;

public class BasicPageDef {

    private WebDriver driver = Hooks.driver;

    BasicPage basicPage = new BasicPage(driver);

    @Then("Click {string} button")
    public void clickButton(String text) {
        basicPage.clickLoginInButton(text);
    }

    @Then("Click {string} button span")
    public void clickButtonSpan(String arg0) {
        basicPage.clickButtonSpan(arg0);
    }

    @Then("Content is {string} visible")
    public void contentWithVisible(String arg0) {
        boolean contentIsVisible = basicPage.contentIsVisible(arg0);
        Assert.assertTrue(contentIsVisible);
    }

    @Then("Open {string} page")
    public void openPage(String arg0) {
        driver.get(EnvConfig.URI_LOGIN + arg0);
    }
}
