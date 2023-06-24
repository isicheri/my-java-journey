package practice;

import java.text.NumberFormat;
import java.util.Scanner;

import static java.text.NumberFormat.*;

public class CountBox {
    //learning how to handle exceptions

    public static void main(String[] args) {
        final double boxPrice = 3.25;
        Scanner scn = new Scanner(System.in);
        NumberFormat cur = NumberFormat.getCurrencyInstance();


        System.out.println("how many boxes do we have");

        String numBoxesIn = scn.next();


        try {
            int numBoxes = Integer.parseInt(numBoxesIn);

            System.out.println("the value is");
            System.out.println(cur.format(numBoxes * boxPrice));
        }catch (NumberFormatException e) {
            System.out.println("that's not a Number")
            ;
        }

    }
}
