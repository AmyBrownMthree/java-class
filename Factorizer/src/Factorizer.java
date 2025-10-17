import java.util.Scanner;

public class Factorizer {

    public static void main(String[] args){

        //define variables
        int userNum;
        int[] factors = new int[];

        //define Scanner
        Scanner inputReader = new Scanner(System.in);

        //recieve user inputted number
        System.out.println("What number would you like to factor?");
        userNum = inputReader.nextInt();

        System.out.println("The factors of "+ userNum +" are:");



    }
}
