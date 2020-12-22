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

        WebElement emailFiled = driver.findElement(By.xpath("//input[@id = 'email']"));
        emailFiled.sendKeys(text);
    }

    public void inputFirstName(String text) {
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        firstName.sendKeys(text);
    }

    public void inputLastName(String text) {
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        lastName.sendKeys(text);
    }

    public String getFirstName() {
        WebElement firstName = driver.findElement(By.xpath("//input[@id='form_firstName']"));
        return firstName.getAttribute("value");
    }

    public String getLastName() {
        WebElement lastName = driver.findElement(By.xpath("//input[@id='form_lastName']"));
        return lastName.getAttribute("value");
    }
}

