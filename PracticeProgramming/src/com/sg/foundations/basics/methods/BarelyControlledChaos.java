package com.sg.foundations.basics.methods;

import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = getColour(); // call color method here
        String animal = getAnimal(); // call animal method again here
        String colorAgain = getColour(); // call color method again here
        int weight = getRandInt(5,200); // call number method,
        // with a range between 5 - 200
        int distance = getRandInt(10,20); // call number method,
        // with a range between 10 - 20
        int number = getRandInt(10000, 20000); // call number method,
        // with a range between 10000 - 20000
        int time = getRandInt(2,6); // call number method,
        // with a range between 2 - 6

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
                + weight + "lb " + " miniature " + animal
                + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
                + number + " " + colorAgain + " poppies for nearly "
                + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
                + "let me tell you!");
    }

    public static String getColour(){
        Random rng = new Random();
        int choice = rng.nextInt(5);

        return switch (choice) {
            case 0 -> "blue";
            case 1 -> "red";
            case 2 -> "yellow";
            case 3 -> "green";
            case 4 -> "purple";
            default -> "black";
        };
    }

    public static String getAnimal(){
        Random rng = new Random();
        int choice = rng.nextInt(5);

        return switch (choice) {
            case 0 -> "dog";
            case 1 -> "cat";
            case 2 -> "rabbit";
            case 3 -> "cow";
            case 4 -> "sheep";
            default -> "human";
        };

    }

    public static int getRandInt(int low, int high){
        Random rng = new Random();
        return rng.nextInt(high - low +1) + low ;
    }
}
