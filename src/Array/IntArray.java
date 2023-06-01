package Array;

import java.util.Arrays;

public class IntArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 56, 7, 8};

        System.out.println(array.length);

        //this will sort the array
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);

        }

        System.out.println("\n------------");

        int[] array2 = new int[5];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        System.out.println(array2[1]);

    }
}
