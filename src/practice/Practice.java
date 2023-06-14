package practice;

import java.util.Scanner;

public class Practice {

    //        Write a short Java function, inputAllBaseTypes, that inputs a different
//        value of each base type from the standard input device and prints it back to the
//        standard output device.
    public static void InputAllBaseType() {
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



//    Write a short Java program that takes two arrays a and b of length n storing int
//    values, and returns the dot product of a and b. That is, it returns an array c of
//    length n such that c[i] = a[i] · b[i], for i = 0,… ,n − 1.

    
    public static void main(String[] args) {
//    Practice.smallInt(9);
//        Practice.oddSum(9);
        int[] a = new int[]{2,4,5,6,7,8,9,1,7};
        Practice.checkOdd(a);
    }
}
