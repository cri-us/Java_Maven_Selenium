package org.example;

import Model.Elements;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestElements {
    public static WebDriver driver;
    private static String baseUrl;

    public static String userName = "Example012";
    public static String email = "example012@gmail.com";
    public static String confirmEmail = "example012@gmail.com";
    public static String userPassword = "blabla123";
    public static String confirmPassword = "blabla123";

    public static Elements elementPage;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/home/user01/Downloads/JavaMaven/JavaMaven/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "https://test.mobilhanem.com.tr/registration/";



        driver.manage().timeouts().implicitlyWait(10, SECONDS);

        driver.manage().timeouts().pageLoadTimeout(200, SECONDS);

        elementPage = new Elements(driver);
    }

    @Test
    public void testUyeol() throws Exception {
        driver.get(baseUrl);

        elementPage.txtUserName().clear();
        elementPage.txtUserName().sendKeys(userName);

        elementPage.txtEmail().clear();
        elementPage.txtEmail().sendKeys(email);

        elementPage.txtConfirmEmail().clear();
        elementPage.txtConfirmEmail().sendKeys(confirmEmail);

        elementPage.txtPassword().clear();
        elementPage.txtPassword().sendKeys(userPassword);

        elementPage.txtConfirmPassword().clear();
        elementPage.txtConfirmPassword().sendKeys(confirmPassword);
        elementPage.btnUyeOl().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        if(elementPage.succesfullyRegistered().isDisplayed()){
            System.out.println("Succesfuly registered");}
        else{
            System.out.println("Element not found");
        }
        elementPage.txtUserName().clear();
        elementPage.txtUserName().sendKeys(userName);

        elementPage.txtEmail().clear();
        elementPage.txtEmail().sendKeys(email);

        elementPage.txtConfirmEmail().clear();
        elementPage.txtConfirmEmail().sendKeys(confirmEmail);

        elementPage.txtPassword().clear();
        elementPage.txtPassword().sendKeys(userPassword);

        elementPage.txtConfirmPassword().clear();
        elementPage.txtConfirmPassword().sendKeys(confirmPassword);
        elementPage.btnUyeOl().sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        if(elementPage.userNameError().isDisplayed()){
            System.out.println("Username already exist");}
        else
            System.out.println("Element not found");
        Thread.sleep(3000);

        if(elementPage.emailError().isDisplayed()){
            System.out.println("Email already exist");}
        else
            System.out.println("Element not found");
        Thread.sleep(3000);

        elementPage.txtUserName().clear();
        elementPage.txtUserName().sendKeys(userName +"exapmle");
        elementPage.btnUyeOl().sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        if(elementPage.emailError().isDisplayed()){
            System.out.println("Again Email already exist");}
        else
            System.out.println("Element not found");

        elementPage.txtEmail().clear();
        elementPage.txtEmail().sendKeys("new"+ email);
        elementPage.btnUyeOl().sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        if(elementPage.succesfullyRegistered().isDisplayed()){
            System.out.println("Succesfuly registered");}
        else{
            System.out.println("Element not found");
        }

        driver.quit();
    }

}