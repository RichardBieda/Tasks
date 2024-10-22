package lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {
     // Diamand task
        int oddNumber = new Scanner(System.in).nextInt();
        int middle = oddNumber / 2;

        for (int i = 0; i < oddNumber; i++) {
            for (int j = 0; j < oddNumber; j++) {
                if (i <= middle) {
                    if (j < middle - i) {
                        System.out.print(" ");
                    } else if (j <= middle + i) {
                        System.out.print("*");
                    }
                } else {
                    if (j < middle - ((oddNumber-1)-i)) {
                        System.out.print(" ");
                    } else if (j <= middle + ((oddNumber-1) - i)) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

//-------------------------------------------------------------------------
        //Write a program that generates a random number 1-100 and then guesses the number in the least
        //amount of tries by itself, knowing whether it guessed too high or too low each time
        int secret = new Random().nextInt(100) +1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int difference = 0;

        while ((guess = scanner.nextInt()) != secret) {
            if (guess > secret) {
                System.out.println("Your guess is too high");
                if (difference == 0) {
                    difference = guess - secret;
                    continue;
                }
                if (guess - secret < difference) {
                    System.out.println("but you come closer");
                }
            } else {
                System.out.println("Your guess is too low");
                if (difference == 0) {
                    difference = secret - guess;
                    continue;
                }
                if (secret - guess < difference) {
                    System.out.println("but you come closer");
                }
            }
        }
        System.out.println("You got it");
    }
}
