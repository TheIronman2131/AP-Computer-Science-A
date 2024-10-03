/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.colelieberthal.homework5;
import java.util.Scanner;
/**
 *
 * @author cal
 */
public class Homework5 {

    public static void main(String[] args) {
        Scanner johnTheScannerTheV = new Scanner(System.in);
        //Problem 0
        System.out.println("Please enter an interger");
        int intA = johnTheScannerTheV.nextInt();
        if (intA%2 == 0) System.out.println("Your integer has no remainder. Your answer is: " + intA/2);
        if (intA%2 == 1) System.out.println("Your number divided by 3 + 1 is: " + intA/3+1);
        //Problem 1
        int x = 10;
        int y = 7;
        //Swap the values of x and y
        x = y;
        System.out.println("The new value of y is: " + y);
        //Problem 2
        int valueA = 3; int valueB = 1; int valueC = 9; int valueD = 4;
        int smallValue = Math.max(Math.max(valueA,valueB),Math.max(valueC, valueD));
        int largeValue = Math.min(Math.min(valueA,valueB),Math.min(valueC, valueD));
        System.out.println("The smallest and largest number in this set of intergers is: " + smallValue + " and " + largeValue);
              
        
    }
}
