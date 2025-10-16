package com.sg.foundations.userinput;

import java.util.Scanner;

public class DoItBetter {

    public static void main(String[] args){

        //define the variables
        int miles, hotDogs, languages;

        //define Scanner
        Scanner inputReader = new Scanner(System.in);

        //console window
        System.out.println("How many miles can you run?");
        miles = inputReader.nextInt();
        System.out.println("I can run more! I can run "+ ((miles * 2) + 1)+" miles!");

        System.out.println("How many hot dogs do you think you can eat?");
        hotDogs = inputReader.nextInt();
        System.out.println("I can eat "+ ((hotDogs * 2) + 1) +" hot dogs");

        System.out.println("How many languages can you speak?");
        languages = inputReader.nextInt();
        System.out.println("Haha i can speak "+ ((languages * 2)+1));
    }
}
