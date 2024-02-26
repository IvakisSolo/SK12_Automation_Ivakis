package Lecture9;

public class PrintChild {
    public static void main(String[] args) {
        Child child = new Child("Jonny Quest", "Male", Religion.ISLAM, "0841251700");
        System.out.println(child);
        child.sayHello();
        child.goToSchool();
        child.celebrateEaster();
    }
}
