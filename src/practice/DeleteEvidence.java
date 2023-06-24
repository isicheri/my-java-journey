package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DeleteEvidence {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/text.txt");
        Scanner scn = new Scanner(System.in);
        char reply;

        do {
            System.out.println("delete evidence? (Y/N)");
            reply = scn.findWithinHorizon(".",0).charAt(0);
        }while(reply != 'y' && reply != 'n');
            if (reply == 'y') {
                System.out.println("Okay, here goes...");
                file.delete();
                System.out.println("The evidence has been deleted.");
            } else {
                System.out.println("Sorry, buddy. Just asking.");
            }

//        int[] guests = new int[10];
//
//        Scanner scn = new Scanner(new File("./src/text.txt"));
//
//        for (int i = 0; i < 10; i++) {
//            guests[i] = scn.nextInt();
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("room No");
//            System.out.println("/t");
//            System.out.println(guests[i]);
//        }
    }
}