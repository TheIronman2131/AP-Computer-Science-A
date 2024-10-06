//@author Cole Lieberthal
package com.redacted.homework2;
public class Homework2 {

    public static void main(String[] args) {
        
        //Problem 1
        
        final double averageSpeed = 65.5;
        int hoursDriven = 8;
        double totalDistance = averageSpeed * hoursDriven;
        System.out.println("You traveled: " + totalDistance + " miles.");
        
        //Problem 2
        
        final double weeklyBudget = 250;
        int day1Spending = 30;
        double day2Spending = 20.5;
        double remainingBudget = weeklyBudget - (day1Spending + day2Spending);
        remainingBudget -= 45.25;
        System.out.println("\nYour remaining Budget is: $" + remainingBudget);
        
        //Problem 3
        
        double celsiusTemp = 22.5;
        double fahrenheitTemp;
        fahrenheitTemp = (celsiusTemp * 1.8)+32;
        System.out.println("\nThe temperature is " + fahrenheitTemp + "°F"); //The degree symbol doesn't work as a char character :(
        
        //Problem 4
        
        final double hourlyWage = 15.75;
        int hoursWorked = 40;
        double totalPay = hourlyWage * hoursWorked;
        totalPay += 50;
        System.out.println("\nYour total pay is: $" + totalPay); 
        
        //Problem 5
        
        int length = 10;
        int width = 5;
        int area = length * width; //Formula for Area
        int perimeter = (width * 2)+(length *2); 
        perimeter += 2; //Accounting for border
        System.out.println("\nThe Area of the rectangle is: " + area + ". \n The Perimeter of the rectangle is: " + perimeter);
        
        //Problem 6
        
        int totalCents = 673;
        int quarter = 25; //Declaring value of coins
        int dime = 10; //Declaring value of coins
        int nickel = 5; //Declaring value of coins
        int pennies = totalCents; //Declaring quantity of coins
        int numberOfQuarters = totalCents/quarter;
        int numberOfDimes = totalCents/dime;
        int numberOfNickels = totalCents/nickel;
        //Retreave the remainder from our division
        int remainderOfQuarters = totalCents%quarter;
        int remainderOfDimes = totalCents%dime;
        int remainderOfNickels = totalCents%nickel;
        //Print Statemnts are grouped together in the console like a paragraph
        System.out.println("\nThere are: " + numberOfQuarters + " quarters. With a remainder of: " + remainderOfQuarters + " cents");
        System.out.println("There are: " + numberOfDimes + " dimes. With a remainder of: " + remainderOfDimes + " cents");
        System.out.println("There are: " + numberOfNickels + " nickels. With a remainder of: " + remainderOfNickels + " cents");
        System.out.println("There are: " + pennies + " pennies. With no remainder.");
                
        
        
    }
}
