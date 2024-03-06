package Lecture10;

import org.testng.annotations.*;

public class PriorityTest {
    @Test(groups = "smoke", priority = -1)
    public void testNameFirst() {
        System.out.println("My First Check ");
    }
    @Test(groups = "smoke", priority = 0)
    public void testNameSecond() {
        System.out.println("My Second Check ");
    }
    @Test(groups = "smoke", priority = -2)
    public void testNameThird() {
        System.out.println("My Third Check ");
    }
}
