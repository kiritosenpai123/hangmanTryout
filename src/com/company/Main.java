package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random r = new Random();

        String[] array = {"germany", "japan", "bulgaria", "england", "serbia"};

        String word = array[r.nextInt(array.length)];
        int count = word.length();
        char[] CharrArr = word.toCharArray();
        char[] dash = word.toCharArray();
        for (int i = 0; i < dash.length; i++) {
            dash[i] = '_';
            System.out.print(dash[i] + " ");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print("\nTry to guess a letter! ");
            char letter = input.next().charAt(0);

            for (int j = 0; j < CharrArr.length; j++) {
                if (letter == dash[j]) {
                    System.out.println("This letter already exists");
                    System.out.println();

                } else {
                    if (letter == CharrArr[j]) {
                        dash[j] = letter;
                        i--;
                        System.out.println("Correct guess!");
                        System.out.println();
                    }
                }
            }
            System.out.println(dash);
            switch (i) {
                case 1:
                    System.out.println();
                    System.out.println("__");
                    break;
                case 2:
                    System.out.println();
                    System.out.println("_|_");

                    break;
                case 3:
                    System.out.println();
                    System.out.println("|");
                    System.out.println("|");
                    System.out.print("\n_");
                case 4:
                    System.out.println();
                    System.out.println("_");
                    System.out.println("|");
                    System.out.println("|");
                    System.out.println("_");
                case 5:
                    System.out.println("");
                case 6:
                    System.out.println("");
                case 7:
                    System.out.println("Whoops! Strike 7! ");
                case 8:
                    System.out.println("Whoops! Strike 8! ");
                case 9:
                    System.out.println("Whoops! Strike 9! ");
                case 10:
                    System.out.println("Whoops! Strike 10! ");
                    System.out.println("You're out!!!");
                    break;
            }
            System.out.print("");
            
            if ((new String(word)).equals(new String(dash))) {
                System.out.println("Congratulations! YOU WIN! \n");
                break;
            }
        }
    }
}
//
//        String secretWord = input.nextLine();
//        for (int i = 0; i <= 20; i++) {
//            System.out.println();
//            char letter;
//        }
//        System.out.println("Word to date: ");
//        for (int j = 0; j < secretWord.length(); j++) {
//            System.out.print("-");
//        }
//        while (attempts <= 10 && attempts > 0) {
//            System.out.println("\n Attempts left: " + attempts);
//            System.out.println("Enter a letter: ");
//            attempts--;
//        }
//        System.out.println("\n --------------------");
//        System.out.println("Sorry but you didnt guess the word!");
//        System.out.println("The secret word was \"" + secretWord + "\"");
//
//    }
//}
