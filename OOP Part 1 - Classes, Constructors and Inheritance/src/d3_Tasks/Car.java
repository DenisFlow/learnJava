package d3_Tasks;

public class Car extends Vehicle{
    private int gear;

    public Car(int speed, int gear) {
        super(speed);
        this.gear = gear;
    }

    public void move() {
        System.out.println("Car moving");
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }
}
