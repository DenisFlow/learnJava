package d1_Classes;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        String validName = model.toLowerCase();
        if (validName.equals("porsche") || validName.equals("holden") )
            this.model = model;
        else
            this.model = "Unknown"
        ;

    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getColour() {
        return colour;
    }
}
