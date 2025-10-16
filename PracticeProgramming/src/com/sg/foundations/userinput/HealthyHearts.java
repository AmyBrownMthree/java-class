package com.sg.foundations.userinput;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args){

        //define variables
        int age, maxHeart;

        //define scanner
        Scanner inputReader = new Scanner(System.in);

        //console window
        System.out.println("What is your age?");
        age = inputReader.nextInt();
        maxHeart = 220 - age;
        System.out.println("Your maximum heart rate should be "+ maxHeart +"beats per minute");
        System.out.println("Your target HR Zone is "+ (maxHeart * 0.5) +"-"+ (maxHeart * 0.85) +"Beats per minute");
    }
}
