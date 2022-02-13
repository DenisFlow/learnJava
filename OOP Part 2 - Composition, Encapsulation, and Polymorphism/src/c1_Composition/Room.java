package c1_Composition;

public class Room {
    private Table theTable;
    private Chair chair;

    public Room(Table theTable, Chair chair) {
        this.theTable = theTable;
        this.chair = chair;
    }

    public void dissembleAccembleTable() {
        if (theTable.isDissembled())
            theTable.assemble();
        else
            theTable.dissemble();
    }
}
