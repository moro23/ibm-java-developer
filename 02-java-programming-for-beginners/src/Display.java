public class Display {
    // Implementing method overloading within a class
    void show(int number){
        System.out.println("Number: " + number);
    }

    void show(String text){
        System.out.println("Text: " + text);
    }

    public static void main(String[] args){
        Display display = new Display(); 
        display.show(10);
        display.show("Hello world");
    }
}