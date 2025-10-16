package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class Birthstones {

    public static void main(String[] args){

        //define variable
        int number;

        //define scanner variable
        Scanner inputReader = new Scanner(System.in);

        //console input
        System.out.println("What month's birthstone would you like to know?");
        number = inputReader.nextInt();

        switch (number){
            case 1:
                System.out.println("Janurary's birthstone is Gamet.");
                break;
            case 2:
                System.out.println("Feburary's birthstone is Amethyst.");
                break;
            case 3:
                System.out.println("March's birthstone is Aquamarine.");
                break;
            case 4:
                System.out.println("April's birthstone is Diamond.");
                break;
            case 5:
                System.out.println("May's birthstone is Emerald.");
                break;
            case 6:
                System.out.println("June's birthstone is Pearl.");
                break;
            case 7:
                System.out.println("July's birthstone is Ruby.");
                break;
            case 8:
                System.out.println("August's birthstone is Peridot.");
                break;
            case 9:
                System.out.println("September's birthstone is Sapphire.");
                break;
            case 10:
                System.out.println("October's birthstone is Opal.");
                break;
            case 11:
                System.out.println("November's birthstone is Topaz.");
                break;
            case 12:
                System.out.println("December's birthstone is Turquoise.");
                break;
            default:
                System.out.println("You entered an invalid number.");
        }
    }
}
