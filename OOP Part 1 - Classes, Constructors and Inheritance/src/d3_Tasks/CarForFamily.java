package d3_Tasks;

public class CarForFamily extends Car {
    private int seats;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public CarForFamily(int speed, int gear, int seats) {
        super(speed, gear);
        this.seats = seats;
    }
}
