package com.sg.foundations.userinput;

import java.util.Scanner;

public class PassingTheTuringTest {

    public static void main(String[] args){

        // declare variables
        String name, favouriteColour, favouriteFood, favouriteNumber;

        //declare Scanner for retrieving input
        Scanner inputReader= new Scanner(System.in);

        // dialog and ask for user input for above variables
        System.out.println("Hello There!");
        System.out.println("What is your name? ");
        name = inputReader.nextLine();
        System.out.println("Hi "+ name+ "! I am Alice.");
        System.out.println("What is your favourite colour?");
        favouriteColour = inputReader.nextLine();
        System.out.println("Huh, "+ favouriteColour +"? Mine is Electric Lime.");
        System.out.println("I really like limes. They are my favourite fruit too.");
        System.out.println("What is your favourite fruit, "+ name + "?");
        favouriteFood = inputReader.nextLine();
        System.out.println("Really? "+ favouriteFood +"? That's wild!");
        System.out.println("Speaking of favourites, what's your favourite number?");
        favouriteNumber = inputReader.nextLine();
        System.out.println(favouriteNumber +" is a cool number. Min's -7.");
        System.out.println("Did you know 42*-7 is "+ 42 * -7+"? That's a cool number too!");
        System.out.println("Well thanks for talking to me, "+ name +".");



    }
}
