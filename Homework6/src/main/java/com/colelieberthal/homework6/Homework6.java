/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.colelieberthal.homework6;

import java.util.Scanner;

/**
 *
 * @author cal
 */
public class Homework6 {

    public static void main(String[] args) {
        Scanner johnTheScannerTheVI = new Scanner(System.in);

        int year;
        System.out.println("Enter a year: ");
        year = johnTheScannerTheVI.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                System.out.println("The year " + year + " is not a leap year.");
            } else {
                System.out.println("The year " + year + " is a leap year.");
            }
        } else {
            System.out.println("The year " + year + " is not a leap year.");
        }
        
        johnTheScannerTheVI.close();
        if (year %4 == 0 || year %400 == 0) System.out.println("The year " + year + "is a leap year.");
    }
}
