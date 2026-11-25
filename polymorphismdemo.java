// 1. Superclass (Parent)
class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

// 2. Subclass 1 (Pig) overriding animalSound()
class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

// 3. Subclass 2 (Dog) overriding animalSound()
class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

// 4. Main Class (must match the file name: PolymorphismDemo.java)
public class polymorphismdemo {
    public static void main(String[] args) {
        // Create objects using the parent type (Animal) reference
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        // Each object executes its own overridden version of the method
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}