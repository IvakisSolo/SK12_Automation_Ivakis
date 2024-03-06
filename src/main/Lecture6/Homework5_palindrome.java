package src.main.Lecture6;

import java.util.Scanner;

public class Homework5_palindrome {
    // A takes as input a non-negative integer and returns true if the number is a palindrome
    public static boolean ifPalindrome() {
        Scanner in = new Scanner(System.in);
        System.out.println("Въведете положително число: ");
        int A = in.nextInt();
        String numStr = Integer.toString(A);
        int i = 0;
        int j = numStr.length() - 1;
        while (i < j) {
            if (numStr.charAt(i) != numStr.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Въведеното число е палиндрома: " + ifPalindrome());
    }
}

