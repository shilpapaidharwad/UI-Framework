package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.CataloguePage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class BasicTest {

WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public LoginPage setUp() {
        System.out.println("i am in set up method start");
        String currentUsersWorkingDir = System.getProperty("user.dir");
        System.out.println("Dir is " + currentUsersWorkingDir);
        System.setProperty("webdriver.chrome.driver", currentUsersWorkingDir + "/src/test/resources/chromedriver");
        System.out.println("I am in Set up method end");
        //driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("I am about to go to Login page");
        return new LoginPage(driver);
    }

        @AfterClass(alwaysRun = true)
        public void tearDown()
        {

            driver.close();
            driver.quit();
        }


    }

