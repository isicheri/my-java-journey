package practice;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int guessNum = 5;
        int rand =  new Random().nextInt(10) + 1;

        System.out.println("*********");
        System.out.println("welcome to the guessing game");
        System.out.println("***********");
        System.out.println("you have only 5 trials");
        System.out.println();

        System.out.println("enter a number from 1 to 10");
        int inputNum = scn.nextInt();
        guessNum--;

        while (inputNum != rand) {
            System.out.println();
            System.out.println("try again");
            System.out.println("you have " + guessNum + " left");
//            System.out.println(rand);
            inputNum = scn.nextInt();
            guessNum--;
            if(guessNum == 0) {
                System.out.println("trial finished");
                System.out.println("you lose....");
                break;
            }
            }
        if(inputNum == rand) System.out.println("you win");
    }
}

//finished the code...