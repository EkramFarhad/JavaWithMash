package ReferenceType;

import java.awt.*;
import java.util.Date;

public class ReferenceTypeOfTheDate {

    public static void main(String[] args) {

        // the reference type is with we have a library and imported and call the object of it.
        // like date bellow

        Date todayDate = new Date();

        System.out.println(todayDate);

        //----------------------------

        // print this value to see the exact deference of reference numbers.

        Point myPointOne = new Point(1,2);
        Point myPointTow = myPointOne;
        myPointOne.x =2;

        System.out.println(myPointTow);

    }
}
