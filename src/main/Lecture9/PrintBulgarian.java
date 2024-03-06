package src.main.Lecture9;

public class PrintBulgarian {
    public static void main(String[] args) {
        Bulgarian bulgarian = new Bulgarian("Ivaylo Yordanov", "Male", "QA", Religion.ORTHODOX, "8304261700");
        System.out.println(bulgarian);
        bulgarian.sayHello();
        bulgarian.danceHoro();
        bulgarian.celebrateEaster();
    }
}
