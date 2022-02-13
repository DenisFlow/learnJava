package c1_Composition;

public class Table {
    private String name;
    private Size size;
    private boolean isDissembled;

    public Table(String name, Size size, boolean isDissembled) {
        this.name = name;
        this.size = size;
        this.isDissembled = isDissembled;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public boolean isDissembled() {
        return isDissembled;
    }

    public void dissemble() {
        System.out.println("Table is dissembled");
        isDissembled = true;
    }

    public void assemble(){
        System.out.println("Table is assembled");
        isDissembled = false;
    }


}
