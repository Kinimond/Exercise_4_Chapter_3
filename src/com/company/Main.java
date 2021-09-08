package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Exercise 4
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner in = new Scanner(System.in);

        System.out.print("I'm thinking of a number between 1 and 100. ");
        System.out.println("Can you guess it?");

        System.out.print("Type a number: ");
        int yourGuess = in.nextInt();
        System.out.println("Your guess is: "+yourGuess);

        System.out.println("The number I was thinking of is: "+number);
        int difference = (number - yourGuess);

        if (difference < 0) difference = difference * -1;
        if (difference == 0) System.out.println("You got it!");
        else
            System.out.println("You were off by: " + difference);

    }
}
