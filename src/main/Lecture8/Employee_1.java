package src.main.Lecture8;

public class Employee_1 {
    public static void main(String[] args) {
        Employee IvayloYordanov = new Employee(1, "Ivaylo", "Yordanov", 1500);
        IvayloYordanov.raiseSalary(15);
        System.out.println(IvayloYordanov);
    }
}
