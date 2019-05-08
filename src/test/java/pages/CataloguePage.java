package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import static org.testng.Assert.assertEquals;

public class CataloguePage {

    WebDriver driver;


    public CataloguePage(WebDriver driver) {

        this.driver = driver;
    }


     public ItemDetailsPage selectProduct(){

        driver.findElement(By.className("info")).click();
        return new ItemDetailsPage(driver);


         }


     }














