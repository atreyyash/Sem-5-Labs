
class Animal{
    public void move(){
        System.out.println("Animals can move");
    }

    public void animalSound(){
        System.out.println("Animals can make sound");
    }
}


class Dog extends Animal{
    public void move(){
        System.out.println("Dogs can walk and run");
    }

    public void dogsSound(){
        super.animalSound();
        System.out.println("Dogs do bark.");
    }
}

public class DynamicPoly {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Dog newDog = new Dog();
        myDog.move();
        myDog.animalSound();
        newDog.move();
        newDog.dogsSound();
    }
    
}