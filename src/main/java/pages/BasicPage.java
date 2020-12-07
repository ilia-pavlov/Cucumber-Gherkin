package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicPage {
    private WebDriver driver;

    public BasicPage(WebDriver driver){
        this.driver = driver;
    }

    public BasicPage() {

    }

    public void clickButton(String text){
        String xpath = "//div[text() ='" + text + "']";
        WebElement button = driver.findElement(By.xpath(xpath));
        button.click();
    }
}
