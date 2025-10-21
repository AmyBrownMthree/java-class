import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StateCapitals {

    public static void main(String[] args){

        //create hash map to store states and their capitals.
        Map<String,String> states = new HashMap<>();

        //populate the Map
        states.put("Alabama","Montgomery");
        states.put("Alaska","Juneau");
        states.put("Arizona","Phoenix");
        states.put("Arkansas","Little Rock");

        printKeys(states);
        printValues(states);
        printBoth(states);
    }

    private static void printBoth(Map<String, String> states) {
        //get both from map and display
        System.out.println("STATE AND CAPITAL PAIRS \n =====");

        for (String currentMap : states.keySet()){
            System.out.println(currentMap +"-"+ states.get(currentMap));
        }
    }

    private static void printValues(Map<String, String> states) {
        //get values from Map using enhanced for loop
        System.out.println("CAPITALS \n =====");

        Collection<String> values = states.values();

        for(String v: values){
            System.out.println(v);
        }
    }

    private static void printKeys(Map<String, String> states) {
        //get keys from the map using enhanced for loop
        System.out.println("STATES \n ======");

        Set<String> keys = states.keySet();

        for(String k: keys){
            System.out.println(k);
        }
    }
}
