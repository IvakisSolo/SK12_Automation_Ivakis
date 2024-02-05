package Lecture4;

import java.util.Scanner;
public class Homework1_dayOfTheWeek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Въведете число от 1 до 7: ");
        int numberOfDay = in.nextInt();
        switch(numberOfDay) {
            case 1:
                System.out.println("Първият ден от седмицата е Понеделник");
            break;
            case 2:
                System.out.println("Вторият ден от седмицата е Вторник");
            break;
            case 3:
                System.out.println("Третият ден от седмицата е Сряда");
            break;
            case 4:
                System.out.println("Четвъртият ден от седмицата е Четвъртък");
            break;
            case 5:
                System.out.println("Петият ден от седмицата е Петък");
            break;
            case 6:
                System.out.println("Шеститят ден от седмицата е Събота");
            break;
            case 7:
                System.out.println("Седмият ден от седмицата е Неделя");
            break;
        }
    }
}
