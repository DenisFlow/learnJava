package f4_List;

/*
Create a program that implements a simple mobile phone with the following capabilities.
Able to store, modify, remove and query contact names.
You will want to create a separate class for Contacts (name and phone number).
Create a master class (MobilePhone) that holds the ArrayList of Contacts The MobilePhone class has the functionality listed above.
Add a menu of options that are available.
Options: Quit, print list of contacts, add new contact, update existing contact, remove contact and search/find contact.
When adding or updating be sure to check if the contact already exists (use name) Be sure not to expose the inner workings of the
Arraylist to MobilePhone e.g. no ints, no .get(i) etc MobilePhone should do everything with Contact objects only.

*/

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<>();

    public void printList() {
        for (int i = 0; i < contacts.size() - 1; i++) {
            System.out.println(i + " " + contacts.get(i).toString());
        }
    }

    // =========================================================

    public boolean isConatactNotUnique(String name) {
        boolean iskeyNew = true;
        for (int i = 0; i < this.contacts.size() - 1; i++) {
            if (this.contacts.get(i).getName() == name) {
                iskeyNew = false;
                break;
            }
        }
        return iskeyNew;
    }

    // =========================================================

    public void addContact(Contacts contact) {
        if (!isConatactNotUnique(contact.getName())) {
            System.out.println("Name of contact is exist in contacts. Change it.");
            return;
        } else {
            contacts.add(contact);
            System.out.println("Contact " + contact.toString() + " added!");
        }
    }

    // =========================================================



    public void updateExistingContact(String name){

    }

}
