package src.main.Lecture6;

import java.util.Scanner;

public class Homework1_smallestNumber {
    // Write a Java method to find the smallest number among three numbers
    public static String smallEllement() {
        Scanner in = new Scanner(System.in);

        System.out.print("Въведете елемент 1: ");
        int element1 = in.nextInt();

        System.out.print("Въведете елемент 2: ");
        int element2 = in.nextInt();

        System.out.print("Въведете елемент 3: ");
        int element3 = in.nextInt();

        int[] array = {element1, element2, element3};
        int smallest = array[0];
        for (int element: array) {
            if (element < smallest) {
                smallest = element;
            }
        }
        return String.valueOf(smallest);
    }

    public static void main(String[] args) {
        System.out.print("Най-малкият елемент е: " + (smallEllement()));
    }
}
