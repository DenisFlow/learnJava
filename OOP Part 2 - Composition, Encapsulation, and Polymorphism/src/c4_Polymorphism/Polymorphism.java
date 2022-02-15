package c4_Polymorphism;
/*
We are going to go back to the car analogy.
Create a base class called Car
It should have a few fields that would be appropriate for a generic car class
engine, cylinders, wheels, etc.
Constructor should initialize cylinders (number of) and name, and set wheels to 4
 and engine to true. Cylinders and names would be passed parameters.
Create appropriate getters
Create some methods like startEngine, accelerate, and brake
show a message for each in the base class
Now create 3 sub classes for your favorite vehicles.
Override the appropriate methods to demonstrate polymorphism in use.
put all classes in the one java file (this one).

*/

class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        System.out.println("Car startEngine");
    }

    public void accelerate() {
        System.out.println("Car accelerate");
    }

    public void brake() {
        System.out.println("Car break");
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class BMW6 extends Car{
    public BMW6() {
        super("BMW6", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW6 startEngine");
    }
    @Override
    public void accelerate() {
        System.out.println("BMW6 accelerate");
    }
    @Override
    public void brake() {
        System.out.println("BMW6 break");
    }
}

class Audi6 extends Car{
    public Audi6() {
        super("Audi6", 10);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi6 startEngine");
    }
    @Override
    public void accelerate() {
        System.out.println("Audi6 accelerate");
    }
    @Override
    public void brake() {
        System.out.println("Audi6 break");
    }
}

class Reno8 extends Car{
    public Reno8() {
        super("Reno8", 12);
    }

    @Override
    public void startEngine() {
        System.out.println("Reno8 startEngine");
    }
    @Override
    public void accelerate() {
        System.out.println("Reno8 accelerate");
    }
    @Override
    public void brake() {
        System.out.println("Reno8 break");
    }
}

class Holden extends Car{
    public Holden() {
        super("Reno8", 12);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden startEngine");
    }
    @Override
    public void accelerate() {
        System.out.println("Holden accelerate");
    }
    @Override
    public void brake() {
        System.out.println("Holden break");
    }
}


