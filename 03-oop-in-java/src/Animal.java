public class Animal {

    private String name; 
    
    // constructor
    public Animal(String name){
        this.name = name;
    }

    public String sound(){
        return null;
    }

    public String toString(){
        return name.concat(" says ").concat(sound());
    }

    
    public static void main(String s[]){
        Animal animal1 = new Dog("Bruce");
        Animal animal2 = new Cat("Popolampo");
        // Animal animal3 = new Cow("Molly");

        System.out.println("Animal1 sound " + animal1.sound());
        System.out.println("Animal2 sound " + animal2.sound()); 
        // System.out.println("Animal3 sound " + animal3.sound());

    }
    
}

// lets create a child class called Dog that inherits from the parent class Animal
class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    public String sound(){
        return "Woof";
    }
}

// lets create another child class classed called Cat, that inherits from the Animal Class
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    public String sound(){
        return "Meow";
    }

}
