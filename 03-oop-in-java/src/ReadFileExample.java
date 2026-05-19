import java.io.IOException;
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args){
        // Lets create a Scanner object to read user input form the console 
        Scanner scanner = new Scanner(System.in); 

        // Lets ask the user to input the name of the file they want to read
        
        System.out.println("Enter the name of the file you want to read.");

        // lets get the file from the user input 
        Path filePath = Paths.get(scanner.nextLine()); 

        try{
            // lets read the entire content of the fiel as a single string 
            String content = Files.readString(filePath);

            System.out.println(content);

            scanner.close();
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
}
