package c1_Switch;

public class Switch {
    public static void main(String[] args) {
//        Task();
        c1_1_Task.makeTask1();
        c1_2_Task.Task_2();
    }


    public static void Task(){
        int value = 1;
        switch (value){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3: case 4: case 5:
                System.out.println("From 3 to 5");
                System.out.println("Stop");
                break;
            default:
                System.out.println("Something else");
                break;
        }
    }
}
