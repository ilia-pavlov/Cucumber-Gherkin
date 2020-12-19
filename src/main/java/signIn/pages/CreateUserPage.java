package signIn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateUserPage {

    private  WebDriver driver;
    public  CreateUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputEmail(String text) {
        String xpath = "//input[@id = 'email']";
        ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath));
        new WebDriverWait(driver, 10).until(condition);

        WebElement emailFiled = driver.findElement(By.xpath(xpath));
        emailFiled.sendKeys(text);
    }

    public void inputFirstName(String text) {
        String xpath = "//input[@id = 'firstName']";
        WebElement firstName = driver.findElement(By.xpath(xpath));
        firstName.sendKeys(text);
    }

    public void inputLastName(String text) {
        String xpath = "//input[@id = 'lastName']";
        WebElement lastName = driver.findElement(By.xpath(xpath));
        lastName.sendKeys(text);
    }
    // inputLastName issue | agreement box
}

