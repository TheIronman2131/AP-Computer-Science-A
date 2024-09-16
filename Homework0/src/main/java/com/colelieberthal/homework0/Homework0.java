/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.colelieberthal.homework0;
import java.util.Scanner;


/**
 *
 * @author cal
 */
public class Homework0 {

    public static void main(String[] args) {
        String question1 = "What is your name?";
        
        Scanner name = new Scanner(System.in);
        
        System.out.println(question1);
        String questionFootballTeam = "What is your favorite NFL team?";
        String yourName = name.nextLine();
        System.out.println(" ");
        System.out.println("Hello " + yourName + "!" + " What is your favorite activity? (Baseball or Football?)");
        String activity = name.nextLine();
        String positionQuestion = "What is your favorite position?";
        System.out.println("Interesting," + questionFootballTeam);
        if(activity.equalsIgnoreCase("baseball")){
            System.out.println(positionQuestion);
        }
        String positionSecondBase = "Do you play second base?";
        
        String playsFirstBase = name.nextLine();
        String baseballPosition = name.nextLine();
        if (baseballPosition.equalsIgnoreCase("2nd Base")){
            System.out.println("2nd Base is a fun position to play. Lots of action between bases and stealing.");
        }
        if (baseballPosition.equalsIgnoreCase("1st Base"));{
        System.out.println("Do you play 1st base?");
        if (playsFirstBase.equalsIgnoreCase("Yes"));{
        System.out.println("1st Base is a fun position to play!");
        if(playsFirstBase.equalsIgnoreCase("No"));{
            System.out.println("Alrighty, " + yourName + "Have a nice Day!");
        }
            
        }
    }
        String favoriteFootballTeam = name.nextLine();
        if (activity.equalsIgnoreCase("football")){
            System.out.println("I will keep that in mind for later in the season. It is nice knowing your favorite team is The " + favoriteFootballTeam);
        }
        System.out.println("It was nice talking with you! Have a good day " + yourName + "!");
        
                
        
                
        
      
      
    }
}
