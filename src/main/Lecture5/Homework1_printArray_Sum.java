package src.main.Lecture5;

public class Homework1_printArray_Sum {
    //Write program to print sum of a given array elements
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int possition = array.length -1; possition >=0; possition--) {
            sum += array[possition];
        }
        System.out.println("The sum of the array is:" + sum);
    }
}
