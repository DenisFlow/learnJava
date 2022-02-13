package c1_Composition;

public class Composition {
    public static void main(String[] args) {
//        Case theCase = new Case("22D", "Dell", "240", new Dimensions(100, 200, 300));
//        Monitor theMonitor = new Monitor("YT56", "Acer", 27, new Resolution(200, 500));
//        Motherboard theMotherboard = new Motherboard("KL-342", "Asus", 4, 5, "v2.12");
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();
/*
Create a single room of a house using composition.
Think about the things that should be included in the room.
Maybe physical parts of the house but furniture as well
Add at least one method to access an object via a getter and
then that objects public method as you saw in the previous video
then add at least one method to hide the object e.g. not using a getter
but to access the object used in composition within the main class
like you saw in this video.

*/
        Room room = new Room(new Table("TRE-34", new Size(100, 100), true), new Chair("H-12312", true));
        room.dissembleAccembleTable();

    }
}
