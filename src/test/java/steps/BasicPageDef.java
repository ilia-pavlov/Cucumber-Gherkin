package steps;

import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @io.cucumber.java.en.Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }
}
