package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] myChoices = {1,2,3,4,5};
        int sum = 0;


        System.out.printf("Which do you prefer mild or spicy?%n");
        System.out.println("Enter 0 for Mild ");
        System.out.println("Enter 1 for Spicy");
        String choice1 = keyboard.nextLine();

        System.out.printf("Which do you prefer mild or spicy?%n");
        System.out.println("Enter 0 for tea ");
        System.out.println("Enter 1 for coffee");
        String choice2 = keyboard.nextLine();

        System.out.printf("Which do you prefer mild or spicy?%n");
        System.out.println("Enter 0 for breakfast ");
        System.out.println("Enter 1 for lunch");
        String choice3 = keyboard.nextLine();

        System.out.printf("Which do you prefer mild or spicy?%n");
        System.out.println("Enter 0 for summer ");
        System.out.println("Enter 1 for winter");
        String choice4 = keyboard.nextLine();

        System.out.printf("Which do you prefer mild or spicy?%n");
        System.out.println("Enter 0 for paper ");
        System.out.println("Enter 1 for plastic");
        String choice5 = keyboard.nextLine();


    }
}
