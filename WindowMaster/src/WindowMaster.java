import java.util.Scanner;

public class WindowMaster {

    public static void main(String [] args){
        // declare variables for height and width
        float height=0;
        float width=0;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // refactored to have user input for the cost of the window and trim
        float costTrim=0;
        float costWindow=0;

        // refactored to include number of windows
        int numOfWindows=0;

        // initialise the flag for empty input checks
        boolean isValid = false;

        // declare and initialise the scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from user

        do {
            try {
                System.out.println("Please enter window height:");
                height = Float.parseFloat(myScanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        } while(!isValid);

        isValid = false;

        do {
            try {
                System.out.println("Please enter the window width:");
                width = Float.parseFloat(myScanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        } while(!isValid);

        isValid= false;

        do {
            try {
                System.out.println("Please enter the number of windows:");
                numOfWindows = Integer.parseInt(myScanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        } while(!isValid);

        isValid = false;

        do {
            try {
                System.out.println("Please enter the cost of the trim:");
                costTrim = Float.parseFloat(myScanner.nextLine());
                isValid= true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        } while(!isValid);

        isValid = false;

        do {
            try {
                System.out.println("Please enter the cost of the window");
                costWindow = Float.parseFloat(myScanner.nextLine());
                isValid= true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }while (!isValid);

        // calculate the area of window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = 2*(height + width);

        // calculate the total cost - use hard coded value for material cost
        cost = ((costWindow * areaOfWindow) +(costTrim * perimeterOfWindow));

        // display the results to the user
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total cost = " + cost * numOfWindows);
    }
}
