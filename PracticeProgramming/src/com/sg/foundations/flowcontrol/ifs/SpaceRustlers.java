package com.sg.foundations.flowcontrol.ifs;

public class SpaceRustlers {

    public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }

        if (aliens> cows){
            System.out.println("Hurrah, We've got the grub! Hamburger party on Alpha!");
        } else{
            System.out.println("Oh no! The heard got restless and took over! Looks like we are hamburger now...");
        }
    }

    /** If and else if ensures that a variable can only meet one condition within a condition block */
    /** Nothing with the current defined variable but it could possibly allow multiple contradicting outputs from one section */
}
