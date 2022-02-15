package c5_Class_challenge;

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
class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double price;
    private double addition1Price;
    private String addition1Name;
    private double addition2Price;
    private String addition2Name;
    private double addition3Price;
    private String addition3Name;
    private double addition4Price;
    private String addition4Name;

    public Hamburger(String nameBurger, String meat, String breadRollType, double price) {
        this.name = nameBurger;
        this.breadRollType = breadRollType;
        this.price = price;
        this.meat = meat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;

        System.out.println(this.name + " hamburger on " + this.breadRollType + ". Price is " + this.price);

        if (addition1Name != null)
            hamburgerPrice += addition1Price;

        if (addition2Name != null)
            hamburgerPrice += addition2Price;

        if (addition3Name != null)
            hamburgerPrice += addition3Price;

        if (addition4Name != null)
            hamburgerPrice += addition4Price;

        return hamburgerPrice;
    }

}

class HealthyBurger extends Hamburger {

    private double addition5Price;
    private String addition5Name;
    private double addition6Price;
    private String addition6Name;


    public HealthyBurger(String meat, double price) {
        super("Middle Hamburger", meat, "brown", price);
    }

    public void addAddition5(String name, double price) {
        this.addition5Name = name;
        this.addition5Price = price;
    }

    public void addAddition6(String name, double price) {
        this.addition6Name = name;
        this.addition6Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double costOfHamburger = super.itemizeHamburger();
        if (addition5Name != null)
            costOfHamburger += addition5Price;
        if (addition6Name != null)
            costOfHamburger += addition6Price;

        return costOfHamburger;
    }

}
//    class DeluxeBurger extends Hamburger {
//    private int cheese;
//    private int pepper;
//
//
//    public DeluxBurger() {
//        super("Delux Hamburger", "brown rye bread roll", 10);
//    }
//}

class DeluxeBurger extends Hamburger {


    public DeluxeBurger() {
        super("Deluxe Hamburger", "Sausage & Bacon", "white", 14.5);
        super.addAddition1("chips", .12);
        super.addAddition2("drinks", .22);

    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot do this");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot do this");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot do this");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot do this");
    }
}



public class Class_challenge {
    public static void main(String[] args) {
        Hamburger main = new Hamburger("main", "chicken", "white", 3.45);
        main.addAddition1("Tomato", .34);
        main.addAddition2("Lettuce", .12);
        main.addAddition3("Cheese", .31);
        System.out.println("Main price is " + String.format("%.2f", main.itemizeHamburger()));
    }
}
