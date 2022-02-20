package f4_List;

public class Contacts {
    private String name;
    private String number;

    @Override
    public String toString() {
        return "Name " + name + ". Number " + number + ".";
    }

    public Contacts(String name, String number) {
        this.number = number;
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
