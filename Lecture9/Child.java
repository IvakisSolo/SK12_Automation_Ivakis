package Lecture9;

public class Child extends Person {
    public Child(String name, String sex, Religion religion, String egn) {
        super(name, sex, "English", "English", egn, religion, "USA");
    }

    @Override
    public Boolean isAdult() {
        return this.age >= 21;
    }

    public void goToSchool() {
        System.out.println("I'm going to school!");
    }
}
