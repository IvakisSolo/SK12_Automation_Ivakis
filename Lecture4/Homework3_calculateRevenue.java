package Lecture4;

import java.util.Scanner;

public class Homework3_calculateRevenue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Въведете желаното количество: ");
        int quantity = in.nextInt();
        int price = 25;
        int revenue, discount, discount1, discount2, discount3, percent, fullPrice;

        if (quantity < 100) {
            discount1 = 0;
            percent = (discount1 / 100) * price;
            fullPrice = (price * in.nextInt());
            revenue = (fullPrice - percent);
            discount = percent;
            System.out.println("Приходите са:" + revenue);
            System.out.println("Отстъпката е:" + discount + "(" + discount1 + "%)");
        } else if (quantity >= 100 && quantity <= 120) {
            discount2 = 15;
            percent = (discount2 / 100) * price;
            fullPrice = (price * in.nextInt());
            revenue = (fullPrice - percent);
            discount = percent;
            System.out.println("Приходите са:" + revenue);
            System.out.println("Отстъпката е:" + discount + "(" + discount2 + "%)");
        } else {
            discount3 = 20;
            percent = (discount3 / 100) * price;
            fullPrice = (price * in.nextInt());
            revenue = (fullPrice - percent);
            discount = percent;
            System.out.println("Приходите са:" + revenue);
            System.out.println("Отстъпката е:" + discount + "(" + discount3 + "%)");
        }
    }
}