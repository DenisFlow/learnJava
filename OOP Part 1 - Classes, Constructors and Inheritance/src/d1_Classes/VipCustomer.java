package d1_Classes;
/*
Create a new class VipCustomer
it should have 3 fields name, credit limit, and email address.
create 3 constructors
1st constructor empty should call the constructor with 3 parameters with default values
2nd constructor should pass on the 2 values it receives and add a default value for the 3rd 3rd constructor should save all fields.
create getters only for this using code generation of intellij as setters wont be needed test and confirm it works.


*/

public class VipCustomer {
    int creditLimit;
    String name;
    String email;

    public VipCustomer() {
        this(1000, "Default", "@mail");
    }

    public VipCustomer(int creditLimit, String name) {
        this(creditLimit, name, "@mail");

        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(int creditLimit, String name, String email) {
        this.creditLimit = creditLimit;
        this.name = name;
        this.email = email;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
