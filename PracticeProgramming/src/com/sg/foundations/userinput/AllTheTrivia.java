package com.sg.foundations.userinput;

import java.util.Scanner;

public class AllTheTrivia {

    public static void main(String[] args){

        //define variables for user input
        String trivia1, trivia2, trivia3, trivia4;

        //define Scanner for input
        Scanner inputReader = new Scanner(System.in);

        //recieve answers to trivia questions
        System.out.println("What unit is equivilant to 1024 gigabytes?");
        trivia1 = inputReader.nextLine();
        System.out.println("Which planet is the only one that rotates clockwise in our solar system?");
        trivia2 = inputReader.nextLine();
        System.out.println("The largest volcano ever discovered in our solar system is located on which planet?");
        trivia3 = inputReader.nextLine();
        System.out.println("What is the most abundant element in the atmosphere?");
        trivia4= inputReader.nextLine();

        //mess the answers to the questions up
        System.out.println("Wow, 1024 gigabytes is a "+ trivia2+"!");
        System.out.println("I didnt know that the largest ever volcano was discovered on "+ trivia1);
        System.out.println("That is amazing that "+ trivia4 +"is the most abundant element in the atmosphere...");
        System.out.println(trivia3+" is the only planet that rotates clockwise, neat!");

    }
}
