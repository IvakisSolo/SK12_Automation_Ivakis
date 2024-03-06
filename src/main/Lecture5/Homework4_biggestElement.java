package src.main.Lecture5;

public class Homework4_biggestElement {
    //Find biggest element of an array and print it in the console
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int biggest = array[0];
        for (int element: array) {
            if (element > biggest) {
                biggest = element;
            }
        }
        System.out.println("Най-големият елемент е:" + biggest);
    }
}
