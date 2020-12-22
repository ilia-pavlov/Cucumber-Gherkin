package signIn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingInPage {

    private  WebDriver driver;
    public SingInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginInput(String text) {
        String xpath = "//input[@id = 'email']";
        ExpectedCondition<WebElement>condition = ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath));
        new WebDriverWait(driver, 10).until(condition);

        WebElement emailFiled = driver.findElement(By.xpath(xpath));
        emailFiled.sendKeys(text);
    }

    public void passwordInput(String text) {
        String xpath = "//input[@id = 'password']";
        WebElement passwordFiled = driver.findElement(By.xpath(xpath));
        passwordFiled.sendKeys(text);
    }

}

