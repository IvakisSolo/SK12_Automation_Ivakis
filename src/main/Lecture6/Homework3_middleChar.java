package src.main.Lecture6;

public class Homework3_middleChar {
    //    Write a Java method to display the middle character of a string.
    //    Note:
    //    a) If the length of the string is even there will be two middle characters.
    //    b) If the length of the string is odd there will be one middle character.
    //    Write a Java method to count all words in a string.
    public static String middleCharacter(String str) {

        int length = str.length();
        if (length % 2 == 0) {
            int mid = length / 2;
            return str.substring(mid - 1, mid + 1);
        } else {
            int mid = length / 2;
            return String.valueOf(str.charAt(mid));
        }
    }
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String str = "Да живее България!";
        System.out.println("Средният символ е/са: " + middleCharacter(str));

        String sentence = "Да живее България! ";
        System.out.println("Броят на думите е: " + countWords(sentence));
    }
}