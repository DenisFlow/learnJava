package c1_Composition;

public class Car extends Vehicle{
    private int doors;
    private int engineCapasity;

    public Car(String name, int doors, int engineCapasity) {
        super(name);
        this.doors = doors;
        this.engineCapasity = engineCapasity;
    }

}
