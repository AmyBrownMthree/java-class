package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

public class TraditionalFizzBuzz {

    public static void main(String[] args){

        //define variables
        int number;

        //define scanner
        Scanner inoutReader = new Scanner(System.in);

        //get user to input number
        System.out.println("How many units of fizzing and buzzing do you need in your life?");
        number = inoutReader.nextInt();

        //for loop
        for (int i =0; i < number + 1; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizz buzz");
            } else if( i % 3 == 0){
                System.out.println("fizz");
            } else if( i % 5 == 0){
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("TRADITION!!!!");
    }
}
