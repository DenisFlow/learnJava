package d1_Classes;

/*
Create a new class for a bank account
Create fields for the account number, balance, customer name, email and phone number.
Create getters and setters for each field
Create two additional methods
1.	To allow the customer to deposit funds (this should increment the balance field).
2.	To allow the customer to withdraw funds. This should deduct from the balance field but not allow the withdrawal to complete if their are insufficient funds.
You will want to create various code in the Main class (the one created by IntelliJ) to confirm your code is working.
Add some System.out.printin's in the two methods above as well.


*/
public class BankAccount {
    String number;
    int balance;
    String customerName;
    String email;
    String phoneNumber;

    public BankAccount(String number, int balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount() {
        this("0000", 0, "No name", "@mail", "00-00-00"); // set default data
        System.out.println("Empty constructor");
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(int balance) {
        this.balance = balance;
        System.out.println("Remaining balance is " + this.balance);
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(int number) {
        if (number < 0 ) {
            System.out.println("Not allowed");
        } else
            this.balance += number;
        System.out.println("Remaining balance is " + this.balance);
    }

    public void withdrawalFunds(int number) {
        if (this.balance - number < 0) {
            System.out.println("Not allowed");
        } else
            this.balance -= number;
        System.out.println("Remaining balance is " + this.balance);
    }
}
