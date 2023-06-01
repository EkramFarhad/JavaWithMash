package Array;

import java.util.Arrays;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {5, 6, 7}, {12, 13, 14}};

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");
            }
           System.out.println();

        }

    }
}
