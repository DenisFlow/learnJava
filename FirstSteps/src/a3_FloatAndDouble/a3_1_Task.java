package a3_FloatAndDouble;

//Convert a given number of pounds to kilograms.
//        STEPS:
//        1.	Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
//        2.	Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a 2nd appropriate variable.
//        3.	Print out the result.
//        HINT: 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation.
public class a3_1_Task {
    public static void main(String[] args) {
        double pounds = 123.;
        double convertNumber = 0.45359237;
        double kilo = pounds * convertNumber;
        System.out.println("Result of " + pounds + " pounds is " + kilo + " kilograms");

        double pi = 3.1415927;
        double anotherNumber = 3_000_000.4_457_89;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
