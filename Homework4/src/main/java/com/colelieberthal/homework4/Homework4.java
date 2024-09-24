/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.colelieberthal.homework4;
import java.util.Scanner;

/**
 *https://chatgpt.com/share/66f06367-5478-8004-96e1-e00b897f14f9
 *Used ChatGPT to explain the concept of the sleep() function
 *https://stackoverflow.com/questions/5710394/how-do-i-round-a-double-to-two-decimal-places-in-java
 */
public class Homework4 {

    public static void main(String[] args) {
        //Initalize the Scanner
        Scanner johnTheScannerTheIV = new Scanner(System.in);
        //Name
        System.out.println("Hello, enter your name.");
        String name = new String();
        name = johnTheScannerTheIV.nextLine();
        System.out.println("Welcome, " + name);
        System.out.println("Enter a message in this format: 33792792878#YOURMESSAGE#384092939");
        String decodedMsg = johnTheScannerTheIV.nextLine();
        //Problem 1
        System.out.println("\nEnter a value for x1.");
        double x1 = johnTheScannerTheIV.nextInt();
        System.out.println("Enter a value for y1");
        double y1 = johnTheScannerTheIV.nextInt();
        System.out.println("Enter a value for x2");
        double x2 = johnTheScannerTheIV.nextInt();
        System.out.println("Enter a value for y2");
        double y2 = johnTheScannerTheIV.nextInt();
        //Distance Formula & Solving
        System.out.println("The two pairs of points you entered were: (" + (int) x1 + ", " + (int) y1 + ") (" + (int) x2 + ", " + (int) y2 + ")"); 
        System.out.println("\nLet\'s find the distance between those two points!");
        try {
            System.out.println("Thinking [=                 ] 5% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
        try {
            System.out.println("Thinking [==                ] 10% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
        try {
            System.out.println("Thinking [===               ] 15% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
        try {
            System.out.println("Thinking [====              ] 20% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
         try {
            System.out.println("Thinking [=====             ] 25% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
         try {
            System.out.println("Thinking [======            ] 30% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
         try {
            System.out.println("Thinking [=======           ] 35% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
         try {
            System.out.println("Thinking [=======           ] 40% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
         try {
            System.out.println("Thinking [=========        ] 60% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
         try {
            System.out.println("Thinking [=============    ] 80% Complete");
            Thread.sleep(750);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
         //It's at 99% so you must wait 6 seconds.
         try {
            System.out.println("Thinking [================ ] 99% Complete");
            Thread.sleep(6000);
        } catch (InterruptedException e) {
           System.out.println("The selected program ran into an error and must restart.");
        }
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double distanceRounded = Math.round(distance * 100);
        System.out.println("\nThe distance between the ordered pairs is: " + (float) distanceRounded/100);
        //Midpoint Formula & Solving
        double midX = (x1+x2)/2;
        double midY = (y1+y2)/2;
        System.out.println("The midpoint betweent the two ordered pairs is: ("+midX + ", "+midY+")");
        
        
        //Problem 2 Secret Message Decoder
        System.out.println("\n\n\n\nWelcome, Agent " + name + ". You were left an encrypted message by the President of the United States.");
        System.out.println("However, to view this message you must enter the secret password by answering the question provided.\n");
        System.out.println("What is the midpoint multiplied by 3 then divided by 2 then using the modulo operator by 7. After that put that new midpoint under a square root.");
        double passwordX = Math.sqrt((((midX*3)/2)%7));
        double passwordY = Math.sqrt((((midY*3)/2)%7));
        
        //Debug Statement
       System.out.println("[Debug] The answer is: " + passwordX + ", " + passwordY + "\n");
        String message = new String();
        System.out.println("Enter your answer for x:");
        double passwordXInput = johnTheScannerTheIV.nextDouble();
        System.out.println("Enter your answer for y:");
        double passwordYInput = johnTheScannerTheIV.nextDouble();
        if(passwordX == passwordXInput && passwordY == passwordYInput){
            System.out.println("ACCESS GRANTED\nYou have 1 message.");
            try{
                System.out.println("Please wait while we verify your connection... \nThis make take up to 5 seconds...");
                Thread.sleep(5000);
                message = decodedMsg.substring(decodedMsg.indexOf("#")+1);
                 message = message.substring(0, message.indexOf("#"));
                 System.out.println(message);
            } catch(InterruptedException e){
            System.out.println("Internal Exception");
            }
           } else{
                    System.out.println("ACCESS DENIED");
                    }
        //Close the Scanner
        johnTheScannerTheIV.close();
        
        
        
            
        
    }
}
