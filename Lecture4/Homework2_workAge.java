package Lecture4;

import java.util.Scanner;

public class Homework2_workAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете вашата възраст: ");
        int age = scanner.nextInt();
        if (age >=16) {
            System.out.println("Вашата възраст Ви позволява да работите");
        }
        else {
            System.out.println("Вашата възраст не Ви позволява да работите");
        }
    }
}
