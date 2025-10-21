import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    //global variables
    static int ties =0;
    static int userWins =0;
    static int computerWins =0;
    static boolean finish = false;

    public static void main(String[] args){

        do{
            //Define Scanner
            Scanner inputReader = new Scanner(System.in);

            System.out.println("How many rounds do you want to play? 1-10");
            int numRounds = inputReader.nextInt();
            inputReader.nextLine();

            for(int i = 0; i< numRounds; i++){

                //if the input is valid carry on.
                if (validateInput(numRounds)){
                    System.out.println("Rock, Paper or Scissors?");

                    //recieve users choice and ignore case stops errors from occuring later.
                    String userPick = inputReader.nextLine().toLowerCase();
                    //recieve random string from a generator
                    String computerPick = randomPick();

                    //Display outcome to user and increment tie, win, loose counters
                    String gameResult = result(userPick, computerPick);
                    score(gameResult);

                //if input is invalid end game
                }else{
                    return;
                }
            }
            //Display statistics and overall outcome to the console.
            outputScores();

            System.out.println("Would you like to play again? y/n");
            String exit = inputReader.nextLine().toLowerCase();

            //asks the user if they are done playing and resets counters.
            finish = checkContinue(exit);

        } while (!finish);
    }

    private static boolean checkContinue(String exit) {
        // decide if the user is done playing
        if (exit.equals("n")) {
            // exits the application
            return true;
        } else {
            // resets statistics for a new game
            ties = 0;
            userWins = 0;
            computerWins = 0;
            return false;
        }
    }

    //Output the overall game statistics and scores to the console
    private static void outputScores() {

        System.out.println("\nThere were "+ ties +" ties!");
        System.out.println("You won "+ userWins +" times!");
        System.out.println("The computer won "+ computerWins +" times!\n");

        if (userWins > computerWins){
            System.out.println(" YOU WIN! ");
        } else if (computerWins > userWins){
            System.out.println(" COMPUTER WINS! ");
        }else {
            System.out.println(" IT WAS A TIE... ");
        }
    }

    //increments instance variables depending on the round outcome
    private static void score(String gameResult) {
        switch (gameResult){
            case "tie":
                ties ++;
                break;
            case "user win":
                userWins ++;
                break;
            case "computer win":
                computerWins ++;
                break;
        }
    }

    //compares the user and computer picks to decide who wins the round and displays to the console.
    private static String result(String userPick, String computerPick) {

        if(userPick.equals(computerPick)){
            System.out.println("That round was a tie!");
            return "tie";
        } else if (userPick.equals("paper") && computerPick.equals("rock")){
            System.out.println("User Wins!");
            return "user win";
        } else if (userPick.equals("scissors") && computerPick.equals("paper")){
            System.out.println("User Wins!");
            return "user win";
        } else if (userPick.equals("rock") && computerPick.equals("scissors")){
            System.out.println("User Wins!");
            return "user win";
        } else {
            System.out.println("Computer Wins!");
            return "computer win";
        }
    }

    //Generates random number which corresponds to an action
    private static String randomPick() {
        Random rng = new Random();
        int randomNumber = rng.nextInt(3);

        return switch (randomNumber) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissors";
            default -> "rock"; // should never happen
        };
    }

    //validates the number of rounds inputted by the user, quits if invalid
    public static boolean validateInput(int numRounds) {
        //if input is outwith parameters, error message and quit.
        try{
            if(numRounds >= 1 && numRounds <= 10){
                return true;
            }else{
                System.out.println("rounds need to be between 1 - 10, quitting...");
                return false;
            }
        } catch (Exception e){
            System.out.println("rounds need to be between 1 - 10, quitting...");
            return false;
        }
    }
}
