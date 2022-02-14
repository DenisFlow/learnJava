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

/*
The purpose of the application is to help a fictitious company called Bills Burgers to manage
their process of selling hamburgers.
Our application will help Bill to select types of burgers, some of the additional items (additions) to
be added to the burgers and pricing.
We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
The basic hamburger should have the following items.
Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
the customer can select to be added to the burger.
Each one of these items gets charged an additional price so you need some way to track how many items got added
and to calculate the final price (base burger with all the additions).
This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
Create a Hamburger class to deal with all the above.
The constructor should only include the roll type, meat and price, can also include name of burger or you
can use a setter.
Also create two extra varieties of Hamburgers (subclasses) to cater for
a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
The healthy burger can have 6 items (Additions) in total.
hint: you probably want to process the two additional items in this new class (subclass of Hamburger),
not the base class (Hamburger), since the two additions are only appropriate for this new class
(in other words new burger type).
b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed,
hint: You have to find a way to automatically add these new additions at the time the deluxe burger
object is created, and then prevent other additions being made.
All 3 classes should have a method that can be called anytime to show the base price of the hamburger
plus all	each showing the addition name, and addition price, and a grand/final total for the
burger (base price + all additions)
 For the two additional classes this may require you to be looking at the base class for pricing and then
 adding totals to final price.


*/


