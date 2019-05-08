package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import tests.SimpleLoginTest;

import static org.testng.Assert.assertTrue;
public class LoginPage {

    WebDriver driver;

   public LoginPage(WebDriver driver)
    {

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //private final Webdriver driver
   /* @FindBy(id="spree_user_email")
    private WebElement UserName;
    @FindBy(id="spree_user_password")
    private WebElement Password;
    @FindBy(name="commit")
    private WebElement Submit;*/
   @FindBy(id="spree_user_email")
   private WebElement UserName;
   @FindBy(id="spree_user_password")
   private WebElement Password;
   @FindBy(name="commit")
   private WebElement Submit;

   public CataloguePage testLogin(String name, String password)
    {
        //driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.navigate().to("https://spree-vapasi.herokuapp.com");
        driver.findElement(By.id("link-to-login")).click();
        UserName.sendKeys(name);
        Password.sendKeys(password);
        Submit.click();
        return new CataloguePage(driver);
    }


}




