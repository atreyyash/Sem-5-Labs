
class Animal{
    public void move(){
        System.out.println("Animals can move");
    }

    public void animalSound(){
        System.out.println("Animals can make sound");
    }
}


class Dog extends Animal{
    @Override
    public void move(){
        super.move();
        System.out.println("Dogs can walk and run");
    }

    public void dogsSound(){
        super.animalSound();
        System.out.println("Dogs do bark.");
    }
}

public class DynamicPoly {
    public static void main(String[] args) {
        Dog newDog = new Dog();
        newDog.move();
        newDog.dogsSound();
    }
    
}