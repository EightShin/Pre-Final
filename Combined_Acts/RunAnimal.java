import java.util.Scanner;

public class RunAnimal {
    public static void main(String[] args) {
        
        Scanner animalScanner = new Scanner(System.in);
        System.out.print("Enter animal type (Bird, Cat, Dog): ");
        String animalType = animalScanner.nextLine();

        Animal animal;

        if (animalType.equalsIgnoreCase("Bird")) {
            animal = new Bird();
        } else if (animalType.equalsIgnoreCase("Cat")) {
            animal = new Cat();
        } else if (animalType.equalsIgnoreCase("Dog")) {
            animal = new Dog();
        } else {
            System.out.println("Unknown animal type!");
            animalScanner.close();
            return;
        }

        animal.eat();
        animal.sleep();
        animal.makeSound();
        
    }
}

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}

class Bird extends Animal {
    public void eat() {
        System.out.println("The bird pecks at its food.");
    }

    public void sleep() {
        System.out.println("The bird sleeps in its nest.");
    }

    public void makeSound() {
        System.out.println("Tweet tweet!");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("The cat eats fish.");
    }

    public void sleep() {
        System.out.println("The cat sleeps quietly on the couch.");
    }

    public void makeSound() {
        System.out.println("Meow meow!");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("The dog eats bones.");
    }

    public void sleep() {
        System.out.println("The dog sleeps beside its owner.");
    }

    public void makeSound() {
        System.out.println("Woof woof!");
    }
}
