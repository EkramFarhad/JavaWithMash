package Array;

import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {

        String[] strArray = {"Sam", "Ek", "Noble"};

        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] +" ");

        }

        System.out.println("\n------------------");

        for (String str : strArray) {
            System.out.print(str + " ");

        }


    }
}
