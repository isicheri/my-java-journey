import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class InputExample {
    public static void countNum(int[]  a, int v) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(v == a[i]) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void formatName(String firstName,String lastName) {
        String a = firstName.substring(0,1);
        String b = lastName.substring(0,1);

        System.out.println(a.toUpperCase() +
                firstName.substring(1,firstName.length()) + " " + b.toUpperCase() +
                lastName.substring(1,lastName.length()));
    }

    public static void main(String[] args) throws IOException {
//        Scanner scn = new Scanner(System.in);
//        int num = scn.nextInt();
//        int randNum = new Random().nextInt(10,11);
//        System.out.println(randNum);
//        InputExample.countNum(new int[]{2,4,5,2,6,2,7,2},2);
//        InputExample.formatName("dominion","isicheri");

        Scanner scn = new Scanner(System.in);

        System.out.println("enter your height in centimeters");

        float height = scn.nextFloat();
        System.out.print("Enter your weight in kilograms: ");

        float weight = scn.nextFloat();
        float bmi = weight/(height * height) * 10000;

        System.out.println("your body mass index is: " + bmi + ".");

    }
}
