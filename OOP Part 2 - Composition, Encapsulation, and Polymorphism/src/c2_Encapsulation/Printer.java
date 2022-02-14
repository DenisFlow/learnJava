package c2_Encapsulation;

/*
Create a class and demonstate proper encapsulation techniques
the class will be called Printer
It will simulate a real Computer Printer
It should have fields for the toner Level, number of pages printed, and
also whether its a duplex printer (capable of printing on both sides of the paper).
Add methods to fill up the toner (up to a maximum of 100%), another method to
simulate printing a page (which should increase the number of pages printed).
Decide on the scope, whether to use constructors, and anything else you think is needed.

*/

public class Printer {
    private int tonerLevelPrinter = 0;
    private int numberOfPapersPrinted = 0;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        fillUpToner(tonerLevel);
        this.duplex = duplex;
    }

    public int fillUpToner(int tonerAmountAdd) {
        if (tonerAmountAdd < 0) {
            System.out.println("Negative number of toner");
            return -1;
        }
        if (tonerAmountAdd + tonerLevelPrinter > 100)
            this.tonerLevelPrinter = 100;
        else
            this.tonerLevelPrinter += tonerAmountAdd;
        System.out.println("Toner remaining " + this.tonerLevelPrinter + " ");
        return this.tonerLevelPrinter;
    }

    public int print(int amountOfPaperToPrint) {
        int goodPrintPaper = 0;
        goodPrintPaper = amountOfPaperToPrint / 2 + amountOfPaperToPrint % 2;
        if (goodPrintPaper == 0) {
            System.out.println("Not enough toner in printer to print any documents");
            return -1;
        }
        this.numberOfPapersPrinted += goodPrintPaper;
        System.out.println("Printed " + goodPrintPaper + " pieces of paper.All paper printed " + this.numberOfPapersPrinted);
        return this.numberOfPapersPrinted;
    }
}
