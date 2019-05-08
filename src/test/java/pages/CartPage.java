package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {

        this.driver = driver;
    }


    public void findITemIntheCart() {
        WebElement Tablecontent = driver.findElement(By.id("cart-detail")).findElement(By.linkText("Ruby on Rails Tote"));


        assertTrue(Tablecontent.isDisplayed());
        System.out.println("Got the prod");
    }


    public boolean lookupCart(String item) {

        List<WebElement> products = driver.findElement(By.id("cart-detail")).findElements(By.className("line-item"));


        for (Iterator<WebElement> iterator = products.iterator(); iterator.hasNext(); ) {
            WebElement next = iterator.next();
            if (next.getText().equals(item))
                    return true;

        }
        return false;
    }

    public boolean validateQuantity(String info,String qty) {

        String value = driver.findElement(By.id("quantity")).getText();
        System.out.println(value);

        if (value.equals(qty))
            return true;

        return false;
           }
}


