public class Strings{
    public static void main(String[] args){
        // creating strings 
        String greeting_1 = "Hello, world!"; 
        
        String greeting_2 = new String("Hello, World"); 

        // lets look at some common string operations 
        // return the number of strings (counts)
        System.out.println("Number of chars in " + greeting_1 + " = " + greeting_1.length());

        // lets access a single char 
        System.out.println("Accessing a single char " + greeting_1.charAt(0));

        // lets concatenate strings 
        // Using + operator 
        String result_1 = "Hello" + " " + "World";
        System.out.println(result_1);

        // Using concat() method 
        String result_2 = "Hello".concat("World");
        System.out.println(result_2); 

        // check for equality in string 
        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".equals("Hello"));
        System.out.println("Hello".equals("World"));

        // Built-in methods  
        String text = " Hello, Java! ";

        System.out.println(text.toUpperCase()); 
        System.out.println(text.toLowerCase()); 
        System.out.println(text.trim());
        System.out.println(text.replace("Java", "World"));
    }
}