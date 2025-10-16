package com.sg.foundations.userinput;

import java.util.Scanner;

public class MiniMadLibs {

    public static void main(String[] args){

        //define variables
        String noun, adjective, noun2, adjective2, pluralNoun, pluralNoun2, pluralNoun3, verbPT, verbSPT;
        int number;

        //define scanner
        Scanner inputReader = new Scanner(System.in);

        //console window
        System.out.println("I need a noun:");
        noun = inputReader.nextLine();
        System.out.println("Niw an adjective:");
        adjective = inputReader.nextLine();
        System.out.println("Another noun:");
        noun2 = inputReader.nextLine();
        System.out.println("And a number:");
        number = Integer.parseInt(inputReader.nextLine());
        System.out.println("Another adjective:");
        adjective2 = inputReader.nextLine();
        System.out.println("A plural noun:");
        pluralNoun = inputReader.nextLine();
        System.out.println("Another one:");
        pluralNoun2 = inputReader.nextLine();
        System.out.println("One more:");
        pluralNoun3 = inputReader.nextLine();
        System.out.println("A verb (infinitive form):");
        verbPT = inputReader.nextLine();
        System.out.println("Same verb (past participle):");
        verbSPT = inputReader.nextLine();

        // output using the above inputs
        System.out.println(noun+ ": the " + adjective +" frontier. These are the voyages of the starship "+ noun2 +". Its "+ number +" year mission: to explore strange "+ adjective2 +" "+pluralNoun+", to seek out "+ adjective2+ " "+pluralNoun2+" and "+adjective2+" "+ pluralNoun3+", to boldly "+ verbPT+" where no one has "+ verbSPT+" before.");
    }
}
