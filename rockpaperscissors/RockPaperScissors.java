/*@author Cal
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.cal.rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {
//Scissors == 0
//Rock == 1
//Paper == 2

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain){
        System.out.println("Lets Play Rock, Paper, Scissors! You go first.\n");
        String userResponse = userInput.nextLine();
        int aiInput = (int) (Math.random() * 2);
        String aiChoice;
        switch (aiInput) {
            case 0:
                aiChoice = "Rock";
                break;
            case 1:
                aiChoice = "Paper";
                break;
            case 2:
                aiChoice = "Scissors";
                break;
            default:
                aiChoice = "";
        }
        System.out.println("I chose " + aiChoice);
        if (userResponse.equalsIgnoreCase(aiChoice)) {
            System.out.println("\nWe Tied...");
        } else if ((userResponse.equalsIgnoreCase("Rock") && aiChoice.equals("Scissors")) || (userResponse.equalsIgnoreCase("Paper") && aiChoice.equals("Rock")) || (userResponse.equalsIgnoreCase("Scissors") && aiChoice.equals("Paper"))) {
            System.out.println("\nYou Win!!!");
        } else {
            System.out.println("\nYou Lose, womp womp.");
        }
        System.out.println("\nDo you want to play again? (y/n)");
            String response = userInput.nextLine();
            if (!response.equalsIgnoreCase("y")) {
                playAgain = false;
            }
        }
    }
}
