package src.main.Lecture8;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double salaryPerMonth;

    public Employee(int id, String firstName, String lastName, double salaryPerMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPerMonth = salaryPerMonth;
    }
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
    public double getAnnualSalary() {
        return this.salaryPerMonth * 12;
    }
    public double raiseSalary(int percent) {
        this.salaryPerMonth += (salaryPerMonth * percent) / 100;
        return this.salaryPerMonth;
    }
    public String toString() {
        StringBuilder myEmployee = new StringBuilder();
        myEmployee.append("Full Name: ").append(this.getName());
        myEmployee.append("\n");
        myEmployee.append("AnnualSalary: ").append(this.getAnnualSalary());
        myEmployee.append("\n");
        myEmployee.append("Salary with raise: ").append(this.salaryPerMonth);
        return myEmployee.toString();
    }
}