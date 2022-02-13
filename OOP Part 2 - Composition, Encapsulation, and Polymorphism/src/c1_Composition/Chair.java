package c1_Composition;

public class Chair {
    private String name;
    private boolean comfortable;

    public Chair(String name, boolean comfortable) {
        this.name = name;
        this.comfortable = comfortable;
    }

    public String getName() {
        return name;
    }

    public boolean isComfortable() {
        return comfortable;
    }
}
