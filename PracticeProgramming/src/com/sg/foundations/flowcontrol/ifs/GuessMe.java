package com.sg.foundations.flowcontrol.ifs;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessMe {

    public static void main(String[] args){

        //define variables
        int number, guess;

        //random number
        Random rng = new Random();
        number = rng.nextInt(100)+ 1;

        //scanner define
        Scanner inputReader= new Scanner(System.in);

        //user input
        System.out.println("your guess:");
        guess = inputReader.nextInt();

        //if statements
        if(guess == number){
            System.out.println("Wow, nice guess that was it!");
        }
        if(guess < number){
            System.out.println("Ha, nice try- too low! I chose "+ number);
        }
        if(guess>number){
            System.out.println("Too bad way too high, I chose "+ number);
        }
    }
}
