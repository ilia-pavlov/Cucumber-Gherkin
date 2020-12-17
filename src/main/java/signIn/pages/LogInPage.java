package signIn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

    private  WebDriver driver;
    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginInput(String text){
        String xpath = "//input[@id = 'email']";
        WebElement emailFiled = driver.findElement(By.xpath(xpath));
        emailFiled.sendKeys(text);
    }
    public void passwordInput(String text){
        String xpath = "//input[@id = 'password']";
        WebElement passwordFiled = driver.findElement(By.xpath(xpath));
        passwordFiled.sendKeys(text);
    }
}

