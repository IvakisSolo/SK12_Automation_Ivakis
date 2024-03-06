package src.main.Lecture6;

import java.util.Scanner;

public class Homework4_evenNumber {
    // Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise.
    public static boolean isEven() {
        Scanner in = new Scanner(System.in);
        System.out.println("Въведете число: ");
        int num = in.nextInt();
        return num %2 == 0;
    }
    public static void main(String[] args) {

        System.out.printf("Числото е четно: " + isEven());
    }
}
