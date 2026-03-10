public class Calculator {
    int multiply(int a, int b){
        return a * b; 
    }

    public static void main(String[] args){
        // creating an instance 
        Calculator calc = new Calculator(); 
        // calling the object
        int result = calc.multiply(4, 5);
        System.out.println(result);
    }
}