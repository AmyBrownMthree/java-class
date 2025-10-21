import java.util.Scanner;

public class UserIOImp1 implements UserIO{

    private final Scanner scanner = new Scanner(System.in);

    public void print(String message){
        System.out.println(message);
    }

    public String readString(String message){
        print(message);
        return scanner.nextLine();
    }

    public int readInt(String message){
        print(message);
        return Integer.parseInt(scanner.nextLine());
    }

   public int readInt(String message, int min, int max){
       int value;
       do {
           value = readInt(message +"("+ min +"-"+ max +"):");
           if(value < min || value > max){
               print("Error: Number needs to be between "+ min +" and "+ max +". Try again");
           }
       }while(value <min || value > max);
       return value;
   }

    public double readDouble(String message){
        print(message);
        return Double.parseDouble(scanner.nextLine());
    }

    public double readDouble(String message, double min, double max){
        double value;
        do {
            value = readDouble(message +"("+ min +"-"+ max +"):");
            if(value < min || value > max){
                print("Error: Number needs to be between "+ min +" and "+ max +". Try again");
            }
        }while(value <min || value > max);
        return value;
    }

    public float readFloat(String message){
        print(message);
        return Float.parseFloat(scanner.nextLine());
    }

    public float readFloat(String message, float min, float max){
        float value;
        do {
            value = readFloat(message +"("+ min +"-"+ max +"):");
            if(value < min || value > max){
                print("Error: Number needs to be between "+ min +" and "+ max +". Try again");
            }
        }while(value <min || value > max);
        return value;
    }

    public long readLong(String message){
        print(message);
        return Long.parseLong(scanner.nextLine());
    }

    public long readLong(String message, long min, long max){
        long value;
        do {
            value = readLong(message +"("+ min +"-"+ max +"):");
            if(value < min || value > max){
                print("Error: Number needs to be between "+ min +" and "+ max +". Try again");
            }
        }while(value <min || value > max);
        return value;
    }
}
