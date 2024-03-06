package Lecture10;

import org.testng.annotations.*;

public class DependencyTest {

    @Test(groups = "smoke")
    public void testName() {
        System.out.println("My 1 Check ");
    }

    @Test(groups = "regression", dependsOnMethods = "registrationMethod")
    public void testName1() {
        System.out.println("My 2 Check");
    }

    @Test
    public void registrationMethod() {
        System.out.println("User Registration");
    }
}
