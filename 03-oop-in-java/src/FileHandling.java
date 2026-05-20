import java.io.File; 
import java.io.FileWriter; 
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;


public class FileHandling {

    public static void main(String[] args){
        // lets create an instance of the File 
        File file = new File("data.txt"); 

        // lets check to see if the file exits 
        if (file.exists()){
            System.out.println("File exits");
            System.out.println("Name: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath()); 
            System.out.println("Size: " + file.length());
        }else{
            System.out.println("File does not exits"); 

        }

        try{
                    // lets write some contents to a file 
        FileWriter filewriter = new FileWriter("notes.txt"); 

        BufferedWriter  writer = new BufferedWriter(filewriter); 

        writer.write("The following represents my notes for java programming");
        writer.newLine();
        writer.write("A variable in java is refered to as placeholder or container for holding objects.");
        writer.newLine();

        writer.close();
        System.out.println("Data Written Successfully!");    
        }catch (Exception e){

            System.out.println("Error Writting to file: " + e.getMessage());
        }


      // lets implements file reading 
      try{
        FileReader filereader = new FileReader("notes.txt"); 

        BufferedReader reader = new BufferedReader(filereader); 

        String line; 
        while ((line = reader.readLine()) != null){
            System.out.println(line);

           
        }
        reader.close();
      }catch(Exception e){

       System.out.print("Error reading file: " + e.getMessage());

      }
    }
    
}
