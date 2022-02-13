package d2_Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("You", 8, 20, 2, 4, 1, 20, "New");
//        dog.eat();
//        dog.walk();
        dog.run();
    }
}
