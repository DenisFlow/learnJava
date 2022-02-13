package c1_Composition;

public class Motherboard {
    private String model;
    private String manufactures;
    private int ramSlots;
    private int cardSlot;
    private String bios;

    public Motherboard(String model, String manufactures, int ramSlots, int cardSlot, String bios) {
        this.model = model;
        this.manufactures = manufactures;
        this.ramSlots = ramSlots;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufactures() {
        return manufactures;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public String getBios() {
        return bios;
    }
}
