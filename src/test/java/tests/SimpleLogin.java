package tests;



import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


public class SimpleLogin extends Basic
{

    ChromeDriver driver;



    @Test
    public void testLogin() {


        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        //driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys("spree@example.com");
        driver.findElement(By.id("spree_user_password")).sendKeys("spree123");
        driver.findElement(By.name("commit")).click();
        //WebElement str= driver.findElement(By.xpath("//*[@id=\"nav-bar\"]/li[2]/a"));
        //String value= str.getText();
        assertTrue(driver.findElement(By.linkText("My Account")).isDisplayed());
    }










}
