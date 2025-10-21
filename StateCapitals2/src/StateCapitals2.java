import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapitals2 {

    public static void main (String[] args ) throws IOException {

        //create hashmap
        Map<String, String> states = new HashMap<>();

        //populate the Map
        states.put("Alabama","Montgomery");
        states.put("Alaska","Juneau");
        states.put("Arizona","Phoenix");
        states.put("Arkansas","Little Rock");

        //write to file StateCapitals.txt
        PrintWriter out = new PrintWriter(new FileWriter("StateCapitals.txt"));

        for (String currentMap : states.keySet()){
            out.println(currentMap +"-"+ states.get(currentMap));
        }

        out.flush();
        out.close();

        //read from the file 
        Scanner sc = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));

        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            System.out.println(currentLine);
        }

    }
}
