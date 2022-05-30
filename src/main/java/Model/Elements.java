package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Elements {
    public static WebDriver driver;
    public Elements(WebDriver webDriver) {
        driver = webDriver;

    }

    public WebElement txtUserName() {
        return driver.findElement(By.id("user_login"));
    }

    public WebElement txtEmail() {
        return driver.findElement(By.id("user_email"));
    }

    public WebElement txtConfirmEmail() {
        return driver.findElement(By.id("user_email"));
    }

    public WebElement txtPassword() {
        return driver.findElement(By.id("user_pass"));
    }

    public WebElement txtConfirmPassword() {
        return driver.findElement(By.id("user_confirm_password"));
    }


    public WebElement btnUyeOl() {

        //return driver.findElement(By.cssSelector("button[type='submit']"));
        //return driver.findElement(By.xpath("//button[contains(text(),'')]"));
        //return driver.findElementByXPath("//button[contains(text(),'Text in your webpage')]");
        return  driver.findElement(By.className("button"));

    }

    public WebElement succesfullyRegistered() {
       return driver.findElement(By.xpath("//*[contains(text(),'User successfully registered.')]"));
    }
    public WebElement userNameError() {
        return driver.findElement(By.xpath("//*[contains(text(),'Username already exists.')]"));
    }
    public WebElement emailError() {
        return driver.findElement(By.xpath("//*[contains(text(),'Email already exists.')]"));
    }
};