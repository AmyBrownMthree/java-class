package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class TriviaNight {

    public static void main(String[] args){

        //define variables
        int q1, q2, q3;
        int counter = 0;

        //define Scanner
        Scanner inputReader = new Scanner(System.in);

        //console
        System.out.println("It's Trivia night are you ready!");
        System.out.println("FIRST QUESTION");
        System.out.println("What is the lowest level programming language?");
        System.out.println("1) Source Code\t 2) Assembly Language\t 3) C#\t 4) Machine Code" );
        System.out.println("YOUR ANSWER: ");
        q1 = inputReader.nextInt();

        System.out.println("SECOND QUESTION");
        System.out.println("Website security CAPTCHA forms are descended from the work of?");
        System.out.println("1) Grace Hopper\t 2) Alan Turing\t 3) Charles Babbage\t 4) Larry Page");
        System.out.println("YOUR ANSWER:");
        q2 = inputReader.nextInt();

        System.out.println("FINAL QUESTION");
        System.out.println("Which of these sci-fi ships was once slated for a full size replica in las vegas?");
        System.out.println("1) Serenity\t 2) The Battlestar Galactica\t 3) The USS Enterprise\t 4) The millennium Falcon");
        System.out.println("YOUR ANSWER:");
        q3 = inputReader.nextInt();

        //if statements for points
        if (q1 == 4) {
            counter ++;
        }
        if (q2 == 2){
            counter ++;
        }
        if (q3 == 3){
            counter++;
        }

        //output score
        if (counter >= 1){
            System.out.println("Well done you got "+ counter +" correct.");
        }else{
            System.out.println("You got no points...");
        }
    }
}
