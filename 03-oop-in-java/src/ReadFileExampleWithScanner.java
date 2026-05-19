import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadFileExampleWithScanner {

    public static void main(String[] args){
        try{
            // Lets create Scanner object to read user input from the console 
            Scanner scanner = new Scanner(System.in);
            
            // lets prints the user instructions 
            System.out.println("Enter the name of the file you want to read.");

            Scanner fileScanner = new Scanner(new FileReader(scanner.nextLine()));

            while (fileScanner.hasNext()){
                String fileLine = fileScanner.nextLine(); 

                System.out.println(fileLine);
            } 
            // Close the file scanner to free up resources 
            fileScanner.close();
        }catch(FileNotFoundException e){
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
    
}
