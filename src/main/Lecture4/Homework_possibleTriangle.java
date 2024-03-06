package src.main.Lecture4;

import java.util.Scanner;

public class Homework_possibleTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Въведете първият ъгъл: ");
        int a1 = in.nextInt();
        System.out.print("Въведете вторият ъгъл: ");
        int a2 = in.nextInt();
        System.out.print("Въведете третият ъгъл: ");
        int a3 = in.nextInt();
        int angleSum = a1 + a2 + a3;

        if (angleSum == 180 && a1 > 0 && a2 > 0 && a3 > 0) {
            if (a1 < 90 && a2 < 90 && a3 < 90) {
                 System.out.println("Триъгълникът е осроъгълен");
             }
             else if (a1 == 90 || a2 == 90 || a3 == 90) {
                 System.out.println("Триъгълникът е правоъгълен");
             }
             else {
                 System.out.println("Триъгълникът е тъпоъгълен");
             }
             if (a1 == a3 || a1 == a2 || a2 == a3) {
                 System.out.println("Триъгълникът е равнобедрен");
             }
             else if (a1 == 60 && a2 == 60 && a3 == 60) {
                 System.out.println("Триъгълникът е равностранен");
             }
             else {
                 System.out.println("Тпиъгълникът е разностранен");

             }
        }
        else {
            System.out.println("Невъзможно е да се образува триъгълник");
        }
    }
}

