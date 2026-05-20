import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.TreeMap;

public class Collections {

    public static void main(String[] args){

        // Lets implements a list using ArrayList and LinkedList 

        List<String> fruits = new ArrayList<>(); 

        // Lets Add elements 
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // //Access by index 
        // String first = fruits.get(0); 

        // //remove by index or value 
        // fruits.remove(1); 
        // fruits.remove("Cherry");

        // Print entire list 
        System.out.println("Fruits: " + fruits);

        LinkedList<String> animals = new LinkedList<>(); 

        // Lets add elements to the list 


        // lets implement a set 
        HashSet<String> colors = new HashSet<>(); 

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red"); 


        System.out.println("Colors: " + colors);

        // lets implement a dictionary/map 
        HashMap<String, Integer>  ageMap = new HashMap<>(); 

        //Lets add key-value pair
        ageMap.put("Moro", 24);
        ageMap.put("Sindi", 38);
        ageMap.put("Borcasa", 40);

        System.out.println("Age Map: " + ageMap);


        
    }
    
}
