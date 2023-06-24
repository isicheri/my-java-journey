package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    //        Write a short Java function, inputAllBaseTypes, that inputs a different
//        value of each base type from the standard input device and prints it back to the
//        standard output device.
    public static void InputAllBaseType() {

        //unfinished
        Scanner scanner = new Scanner(System.in);

        double i = (double) scanner.nextInt();
        System.out.println(i);
    }


//    Write a short Java function that takes an integer n and returns the sum of all the
//    integers smaller than n.

    public static void smallInt(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

//    Write a short Java function that takes an integer n and returns the sum of all the
//    odd integers smaller than n.

    public static void oddSum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }


//    Write a short Java function that takes an array of int values and determines if
//    there is a pair of numbers in the array whose product is odd.

    public static void checkOdd(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
               if(a[i] * a[j] % 2 == 0) {
                   System.out.println(a[i] + " " + a[j]);
               }
            }
        }
    }

//    Write a short Java program that outputs all possible strings formed by using the
//    characters 'c', 'a', 'r', ' b', ' o', and 'n' exactly once.



//public static void formWord(char[] a) {
//
//}

//    Write a short Java program that takes two arrays a and b of length n storing int
//    values, and returns the dot product of a and b. That is, it returns an array c of
//    length n such that c[i] = a[i] · b[i], for i = 0,… ,n − 1.


    public static void productArr(int[] a, int[] b,int n) {
        // the variable n is the length of both array a and b which is the
        //same
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }
        System.out.println(Arrays.toString(c));
    }

    /**
     * The birthday paradox says that the probability that two people in a room will
     * have the same birthday is more than half as long as n, the number of people in
     * the room, is more than 23. This property is not really a paradox, but many
     * people find it surprising. Design a Java program that can test this paradox by a
     * series of experiments on randomly generated birthdays, which test this paradox
     * for n = 5,10,15,20,…, 100.
     * **/

    public static void main(String[] args) {
        Practice.productArr(new int[]{1,2,3},new int[]{4,5,6},3);
    }
}
