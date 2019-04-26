package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class AddCartTest extends Basic{

    //ChromeDriver driver;





    @Test
    public void addCart() {
        // driver.findElement(By.id("product_1")).click();
        // driver.findElement(By.className("input-group-btn")).click();
        //assertTrue(driver.findElement(By.linkText("Ruby on Rails Tote")).isDisplayed());

        //driver.close();public void addCart()

        driver.findElement(By.xpath("//span[contains(text(),'Ruby on Rails Tote')]")).click();
        driver.findElement(By.className("input-group-btn")).click();

        assertTrue(driver.findElement(By.id("cart-detail")).findElement(By.linkText("Ruby on Rails Tote")).isDisplayed());
        System.out.println("Got the prod");
        List<WebElement> products = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));


        for (Iterator<WebElement> iterator = products.iterator(); iterator.hasNext(); ) {
            WebElement next = iterator.next();
            System.out.println("The elements in list:" + next);


        }
    }





}

