package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class SampleForAnnotations {



        @BeforeTest
                public void first()
        {

            System.out.println("I am in Before Test");

        }

        @BeforeMethod
    public void second()
        {

            //assertTrue(false);
            System.out.println("I am in Before Method");
    }
    @BeforeTest
    public void third()
    {

        System.out.println("I am in Before Test");
    }

    @AfterTest
    public void fourth()
    {
        System.out.println("I am in After Test");



    }

    }


