// AnimalSounds.java (Ques 3)


class Animal {
    public void makeSound() {
        System.out.printl("Animal noise");
    }
}
 // Subclass of Dog
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}

// Subclass of Cat
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow Meow!");
    }
}

// Subclass of Cow
class Cow extends Animal {
    public void makeSound() {
        System.out.println("Moo Moo!");
    }
}

// Main class
public class AnimalSounds {
    public static void main(String[] args) {
        Animal[] farm = new Animal[3];
        farm[0] = new Dog();
        farm[1] = new Cat();
        farm[2] = new Cow();
        
        for (int i = 0; i < 3; i++) {
            farm[i].makeSound();
        }
    }
}