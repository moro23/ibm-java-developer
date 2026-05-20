import java.io.FileInputStream;
import java.io.FileOutputStream; 
import java.io.IOException; 
public class FileInputStreamExample {

    public static void main(String[] args){

        try(FileInputStream fis = new FileInputStream("input.txt")){

            int byteData; 
            while((byteData = fis.read()) != -1){
                System.out.println((char) byteData);
            }

        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }


            // lets create an ouput file and write data into it... 
        try(FileOutputStream fos = new FileOutputStream("output.txt")){

            String msg = "Hello, How are you doing?";
            fos.write(msg.getBytes());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }

            // Lets read the data on the output file.
        try(FileInputStream fis = new FileInputStream("output.txt")){

            int byteData; 
            while((byteData = fis.read()) != -1){
                System.out.println((char) byteData);
            }

        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }


    }
    
}
