package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class FieldDay {

    public static void main(String[] args){

        //define input variable
        String name, team;

        //define scanner
        Scanner inputReader = new Scanner(System.in);

        //console window
        System.out.println("What's your last name?");
        name = inputReader.nextLine();

        //if statements using compareTo()
        if (name.compareToIgnoreCase("Baggins") < 0){
            team = "Red Dragons";
        } else if (name.compareToIgnoreCase("Dresden") < 0){
            team = "Dark Wizards";
        } else if (name.compareToIgnoreCase("Howl") < 0){
            team = "Moving Castles";
        } else if (name.compareToIgnoreCase("Potter") < 0){
            team = "Golden Snitches";
        } else if (name.compareToIgnoreCase("Vimes")< 0){
            team = "Night Guards";
        } else {
            team = "Black Holes";
        }

        //team output to console
        System.out.println("Ah you are on the team "+ team +"!");
        System.out.println("Good luch in the game!");
    }
}
