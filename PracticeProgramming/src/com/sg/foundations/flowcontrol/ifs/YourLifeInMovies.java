package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class YourLifeInMovies {

    public static void main(String[] args){

        //define variables
        String name;
        int year;

        //define scanner
        Scanner inputReader = new Scanner(System.in);

        //inputs
        System.out.println("Hey, lets play a game! What is your name?");
        name = inputReader.nextLine();
        System.out.println("Okay "+ name +", when were you born?");
        year = inputReader.nextInt();
        System.out.println("Well "+ name +"...");

        //if statements
        if (year < 2005){
            System.out.println("Did you know Pixar's 'Up' came out over a decade ago?");
        }
        if (year < 1995){
            System.out.println("The first Harry Potter movie came out over 15 years ago!");
        }
        if (year < 1985){
            System.out.println("Space Jam came out not last decade, but the one BEFORE that!");
        }
        if (year < 1975){
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        if (year < 1965){
            System.out.println("The MASH TV series has been around for almost half a century");
        }
    }
}
