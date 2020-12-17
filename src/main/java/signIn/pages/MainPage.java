package signIn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {

    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginInButton(String text) {
        String xpath = "//div[text() = '" + text + "']";
        WebElement button = driver.findElement(By.xpath(xpath));
        button.click();
    }
}
