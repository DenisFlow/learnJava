package c1_Switch;

/*
Create a new switch statement using char instead of int create a new char variable create a switch statement testing for
A, B, C, D, or E
display a message if any of these are found and then break Add a default which displays a message saying not found
*/

public class c1_1_Task {

    public static void makeTask1(){
        char ch = 'A';
        String str = "asdf";
        str.toUpperCase();
        str.toLowerCase();
        switch(ch) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("A");
                break;
            case 'C':
                System.out.println("A");
                break;
            case 'D':
                System.out.println("A");
                break;
            case 'E':
                System.out.println("A");
                break;
            default:
                System.out.println("Another");
        }
    }
}
