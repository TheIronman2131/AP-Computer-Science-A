//@author Cal
package com.colelieberthal.homework3;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        //Define the Scanner Class
        Scanner myScanner = new Scanner(System.in);
        //Problem 0
        double earthAge;
        System.out.println("Hello, enter your age in earth years: ");
        earthAge = myScanner.nextDouble();
        double newAge = earthAge * 1.8;
        System.out.println("Your age on the distant planet is: " + (int) newAge + " or " + newAge);
        //Problem 1
        System.out.println("\nWhat is your weight on earth in Kgf?");
        double weightOnEarth = myScanner.nextDouble();
        double weightOnPlanetX = weightOnEarth * 0.65;
        System.out.println("Your weight in Kgf on this distant planet is: " + (int) weightOnPlanetX + ("Kgf ") + "(rounded down)" + " or exactly " + weightOnPlanetX + "Kgf");
        //Problem 2
        System.out.println("\nWhat is the length of your movie in minutes?");
        int lengthInMinutes = myScanner.nextInt();
        int convertedTimeHours = lengthInMinutes/60;
        int convertedTimeMinutes = lengthInMinutes%60;
        System.out.println("Your converted movie time is: " + convertedTimeHours + " Hours and " + convertedTimeMinutes + " Minutes");
        //Problem 3
        System.out.println("\nEnter a base power for your weapon: ");
        int basePower = myScanner.nextInt();
        basePower *= Math.random()+1.5; //Credit to Colton for explaining the Math.Random() method
        System.out.println("Your weapon power is exactly: " + basePower + "\nIn the game database your weapon power is: " + (int) basePower);
        //Problem 4
        System.out.println("\nEnter the temperature in fahrenheit: ");
        double tempF = myScanner.nextDouble();
        double tempC = (tempF-32)*9/5;
        System.out.println("The temperature in celsius is: " + (int) tempC + (" (rounded down)\n") + ("The temperature is exactly: " + tempC));
        //Extra Challenge
        System.out.println("\nWhat is the time on earth?");
        int earthTime = myScanner.nextInt();
        int planetYTimeHours = earthTime/80;
        int planetYTimeMinutes = earthTime%80;
        System.out.println("The time converted for Planet Y is: " + planetYTimeHours + " Hours and " + planetYTimeMinutes + " Minutes");
        //Close the scanner
        myScanner.close();
    }
}