package Phase2.Week1.Week5;

// TestAnimal.java
public class TestAnimal {
    public static void main(String[] args) {
        // Create instances of Dog, Cat, and Cow
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        // Call the makeSound() method for each object
        System.out.println("Dog says:");
        dog.makeSound();

        System.out.println("\nCat says:");
        cat.makeSound();

        System.out.println("\nCow says:");
        cow.makeSound();
    }
}

