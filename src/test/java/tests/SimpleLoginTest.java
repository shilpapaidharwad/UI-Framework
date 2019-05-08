package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.LoginPage;


import static org.testng.Assert.assertTrue;


public class SimpleLoginTest extends BasicTest
{




    @Test(groups= "Cart")
    public void testLogin()
    {
        LoginPage loginpage= new LoginPage(driver);
        loginpage.testLogin("spree@example.com", "spree123");

        //loginToWebsite("spree@example.com" ,"spree123");
        //login
        //WebElement str= driver.findElement(By.xpath("//*[@id=\"nav-bar\"]/li[2]/a"));
        //String value= str.getText();
       WebElement webElement=driver.findElement(By.linkText("My Account"));
        assertTrue(webElement.isDisplayed());
        System.out.println("I have executed Parellel execution");
    }

   /* private void loginToWebsite(String name, String pass) {


        /*driver.navigate().to("https://spree-vapasi.herokuapp.com");
        //driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        driver.findElement(By.id("spree_user_email")).sendKeys(name);
        driver.findElement(By.id("spree_user_password")).sendKeys(pass);
        driver.findElement(By.name("commit")).click();*/





}






