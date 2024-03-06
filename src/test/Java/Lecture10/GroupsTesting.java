package Lecture10;

import org.testng.Assert;
import org.testng.annotations.*;

public class GroupsTesting {
    @Test(groups = "smoke")
    public void testNameFirst() {
        System.out.println("My First Check ");
    }
    @Test(groups = "smoke")
    public void testNameSecond() {
        System.out.println("My Second Check ");
    }
    @Test(groups = "smoke")
    public void testNameThird() {
        System.out.println("My Third Check ");
    }

    @Test(groups = "testGroup")
    public void testNameSecond1() {
        System.out.println("My 1 Check");
    }
    @Test(groups = "testGroup")
    public void testNameSecond2() {
        System.out.println("My 2 Check");
    }
    @Test(groups = "testGroup")
    public void testNameSecond3() {
        System.out.println("My 3 Check");
    }
}
