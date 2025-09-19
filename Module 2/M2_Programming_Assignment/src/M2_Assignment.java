/* Kimberly Orozco, September 19, 2025. M2 Programming Assignment */
/* Purpose of this assignment is to write a program like Rock-Paper-Scissors*/

import java.util.Scanner;

public class M2_Assignment {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int userChoice = scn.nextInt();
        // I chose not to display what number the user chose because I thought it was redundant.

        // Right here is just saying what the user chose.
        if (userChoice == 1) {
            System.out.println("You chose Rock!");
        } else if (userChoice == 2) {
            System.out.println("You chose Paper!");
        } else if (userChoice == 3) {
            System.out.println("You chose Scissors!");
        } else {
            System.out.println("Invalid Choice!");
        }

        // Randomizer here
        int compChoice = (int)(Math.random() * 3) + 1;

        // This is just showing what the computer chose
        if (compChoice == 1) {
            System.out.println("Computer chose Rock!");
        } else if (compChoice == 2) {
            System.out.println("Computer chose Paper!");
        } else if (compChoice == 3) {
            System.out.println("Computer chose Scissors!");
        }

        // This is the whole thingy of options.
        if (userChoice == compChoice) {
            System.out.println("It's a tie!");
        } else if (userChoice == 1 && compChoice == 3) {
            System.out.println("You win! Rock beats Scissors. :D ");
        } else if (userChoice == 2 && compChoice == 1) {
            System.out.println("You win! Paper beats Rock. :) ");
        } else if (userChoice == 3 && compChoice == 2) {
            System.out.println("You win! Scissors beats Paper. >:) ");
        } else if (userChoice == 1 && compChoice == 2) {
            System.out.println("You lose... Paper beats Rock :( ");
        } else if (userChoice == 2 && compChoice == 3) {
            System.out.println("You lose... Scissors beats Paper. u_u");
        } else if (userChoice == 3 && compChoice == 1) {
            System.out.println("You lose... Rock beats Scissors. T^T");
        } else {
            System.out.println("Choose a real input next time!! >:( ");
        }
    }
}