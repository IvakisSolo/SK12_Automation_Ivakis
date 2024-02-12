package Lecture6;

import java.util.Scanner;

public class Homework2_sumAverage {
    // Write a Java method to compute the average of three numbers
    public static String sumAverage() {
        Scanner in = new Scanner(System.in);

        System.out.print("Въведете елемент 1: ");
        int element1 = in.nextInt();

        System.out.print("Въведете елемент 2: ");
        int element2 = in.nextInt();

        System.out.print("Въведете елемент 3: ");
        int element3 = in.nextInt();

        int[] array = {element1, element2, element3};
        double sumAverage = array[0];
        double sum = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum = sum + array[i];
            sumAverage = sum / 3;
        }
        return String.valueOf(sumAverage);
    }

    public static void main(String[] args) {

        System.out.println("Средната сума от числата е: " + (sumAverage()));
    }
}


