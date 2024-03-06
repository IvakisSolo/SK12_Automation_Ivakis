package src.main.Lecture5;

public class Homework2_staticMatrix {
    //Print elements of a given 2d matrix with 4 rows and 3 columns
    public static void main(String[] args) {
        int[][] array = new int[4][3];
        array[0][0]=1;
        array[0][1]=2;
        array[0][2]=3;
        array[1][0]=4;
        array[1][1]=5;
        array[1][2]=6;
        array[2][0]=7;
        array[2][1]=8;
        array[2][2]=9;
        array[3][0]=10;
        array[3][1]=11;
        array[3][2]=12;
        for (int vertical = 0; vertical < 4; vertical++ ) {
            for (int horizontal = 0; horizontal < 3; horizontal++) {
                System.out.print(array[vertical][horizontal] + " ");
            }
            System.out.println();
        }
    }
}
