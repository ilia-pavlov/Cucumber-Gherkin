package signIn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void avatarButton(){
        String xpath = "//div[@class = 'sc-gVLVqr jRgxno']";
        WebElement avatarButton = driver.findElement(By.xpath(xpath));
        avatarButton.click();
    }
}
