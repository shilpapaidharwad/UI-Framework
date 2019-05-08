package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemDetailsPage {

    WebDriver driver;

    ItemDetailsPage(WebDriver driver)
    {

        this.driver=driver;
    }


    public CartPage addToCart(String classname){
        //TODO: set the number to quantity and click on button

        driver.findElement(By.id(classname)).click();
        return new CartPage(driver);

    }



}
