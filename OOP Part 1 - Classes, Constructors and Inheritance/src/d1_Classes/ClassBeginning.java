package d1_Classes;

public class ClassBeginning {
    public static void main(String[] args) {
        RuncClassCar();
    }

    public static void RuncClassCar() {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println(porsche.getModel());
    }
}
