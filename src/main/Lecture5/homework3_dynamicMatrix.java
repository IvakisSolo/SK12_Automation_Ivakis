package src.main.Lecture5;

import java.util.Scanner;

public class homework3_dynamicMatrix {
    //Print elements of a given 2d matrix with dynamic rows and columns taken from user input
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Въведете брой редове: ");
        int row = in.nextInt();

        System.out.print("Въведете брой колони: ");
        int column = in.nextInt();

        int[][] array = new int[row][column];

        for (int horizontal = 0; horizontal < row; horizontal++) {
            System.out.println("Въведете елемент за ред " + horizontal);
            for (int vertical = 0; vertical < column; vertical++) {
                array[horizontal][vertical] = in.nextInt();
            }
        }

        for (int horizontal = 0; horizontal < row; horizontal++) {
            for (int vertical = 0; vertical < column; vertical++) {
                System.out.print(array[horizontal][vertical] + " ");
            }
            System.out.println();
        }
    }
}
