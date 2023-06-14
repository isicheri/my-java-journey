package practice;

import java.io.File;
import java.util.Scanner;

public class DeleteEvidence {
    public static void main(String[] args) {
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
            }

    }