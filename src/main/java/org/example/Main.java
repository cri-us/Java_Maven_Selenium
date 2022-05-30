package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Main{

    static WebDriver driver;

    @Test
    public static void Test_Login() throws InterruptedException {

        //Provide the Chrome driver path to send the selenium requests to browser
        System.setProperty("webdriver.chrome.driver", "/home/user01/Downloads/JavaMaven/JavaMaven/chromedriver");

        //Launch firefox or chrome browser
        driver = new ChromeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //Implicit wait, wait for at least some time (10 sec) to identify an element,
        // if can't find the element with in 10 sec, throw exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //open the url or AUT
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        //Identify the Username field and type text - standard_user
        WebElement firstName = driver.findElement(By.cssSelector("input[name='username']"));
        firstName.sendKeys("user_login");
        WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
       WebElement errorTitle = driver.findElement(By.xpath("//*[contains(text(),'Error!')]"));

        if(errorTitle.isDisplayed()){
        System.out.println("Element found using text");}

        else
        System.out.println("Element not found");


        Thread.sleep(2000);

        //Close the browser[s]
        driver.quit();
    }
}