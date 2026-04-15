import java.util.Scanner; 

public class AnimalFarm {
    
    public static void main(String s[]){
        Scanner scanner = new Scanner(System.in);
        Animal[] animals = new Animal[10]; 
        int anmIdx = 0; 

        while (true){
            System.out.println( "Press 1 to view the animals, 2 to add animals, any other key to exit");
            String userInput = scanner.nextLine(); 
            if (userInput.equals("1")){
                for (int i=0; i<animals.length; i++){
                    System.out.println(animals[i]);
                }
            } else if (userInput.equals("2")){
                if (anmIdx==10){
                    System.out.print("10 animals added already, cannot add anymore animals");
                    continue; 
                }
                System.out.println("Which animal do you want to create? Press 1 for dog\n, 2 for cat\n, 3 for cow");
                
                String animalChoice = scanner.nextLine(); 
                if (animalChoice.equals("1")){
                    System.out.println("Enter the name of the dog");
                    String dogName = scanner.nextLine(); 
                    Animal anmlTmp = new Dog(dogName);
                    animals[anmIdx++] = anmlTmp;
                }else if (animalChoice.equals("2")){
                    System.out.println("Enter the name of the Cat");
                    String catName = scanner.nextLine(); 
                    Animal anmTemp = new Cat(catName);
                    animals[anmIdx++] = anmTemp;
                }else if(animalChoice.equals("3")){
                    System.out.println("Enter the name of the Cow");
                    String cowName = scanner.nextLine(); 
                    Animal anmTemp = new Cow(cowName); 
                    animals[anmIdx++] = anmTemp;
                }else{
                    break;
                }
            }
        }


    }
    
}
