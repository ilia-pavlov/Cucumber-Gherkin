package signIn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BasicPage {

    private static WebDriver driver;

    public BasicPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickSubmitButton(String text) {
        String xpath = "//span[text() = '" + text + "']/..";
        WebElement submitButton = driver.findElement(By.xpath(xpath));
        submitButton.click();
    }

    public void clickLoginInButton(String text) {
        String xpath = "//div[text() = '" + text + "']";
        WebElement logInButton = driver.findElement(By.xpath(xpath));
        logInButton.click();
    }

    public boolean contentIsVisible(String text) {
        String xpath = "//*[text() = '" + text + "']";
        WebElement content = driver.findElement(By.xpath(xpath));
        return content.isDisplayed();
    }

}
