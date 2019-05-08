package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CataloguePage;
import pages.ItemDetailsPage;

import static org.testng.Assert.assertTrue;

public class ValidateAddProductTest extends BasicTest
{
   CataloguePage  cataloguePage;
   ItemDetailsPage itemDetailsPage;
   CartPage cartPage;

    @Test(dataProvider = "invalidItem")
    public void checkItemNotInCartTest(String item) {

        cataloguePage = new CataloguePage(driver);
        System.out.println("Before Assert");
        Assert.assertFalse(cataloguePage.selectProduct().addToCart("add-to-cart-button").lookupCart(item));
        System.out.println("Executed Data Provider ");

    }

    @DataProvider(name="invalidItem")
    public Object[][] getInvalidItem()
    {
        return new Object[][]{

                { " NAmeone"  }
        };

    }
   /* @Test(dataProvider = "ValidItem")
    public void checkItemInCartTest(String item) {

        cataloguePage = new CataloguePage(driver);
        System.out.println("Before Assert");
        Assert.assertTrue(cataloguePage.selectProduct().addToCart("add-to-cart-button").lookupCart(item));

    }

    @DataProvider(name="ValidItem")
    public Object[][] getValidItem()
    {
        return new Object[][]{

                { "Ruby on Rails Tote"  }
        };

    }*/




    }

    //CartPage listOfElementsPage= new CartPage(driver);




