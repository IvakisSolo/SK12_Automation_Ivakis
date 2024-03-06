package Lecture10;

import org.testng.annotations.*;
public class MyFirstTestClass {

    @BeforeSuite
    public void testBeforeSuite() {
        System.out.println("Before Suite: Clean all DDs");
    }

    @BeforeTest(alwaysRun = true)
    public void testBeforeTest() {
        System.out.println("Before Test: Open Site URL");
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("Before Method: Verify Site is Open");
    }

    @Test
    public void testName() {
        System.out.println("My First Check ");
    }

    @Test(groups = "testGroup")
    public void testNameSecond() {
        System.out.println("My Second Check");
    }

    @AfterMethod
    public void testAfterMethod() {
        System.out.println("After Method: Verify Check");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("After Test: Close Site");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("After Suite: Check DBs");
    }
}
