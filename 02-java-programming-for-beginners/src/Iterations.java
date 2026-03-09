public class Iterations{
    public static void main(String[] args){

        // // implementing a for loop 
        // for (int i = 1; i <= 5; i++){
        //     System.out.println(i);
        // }

        // implementing a while loop 
        // int i = 1; 
        // while (i <= 5){
        //     System.out.println(i);
        //     i++;
        // }

        // implementing a do-while loop 
        // int i = 7; 
        // do {
        //     System.out.println(i);
        //     i++; 
        // } while(i <= 5);

        // implementing a nested-for loop 
        for (int i=1; i <= 10; i++){
            for (int j=1; j <= 10; j++){
                System.out.println(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}