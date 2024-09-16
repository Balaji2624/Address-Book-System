package com.bridgelabz.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

// AddressBook class to manage the list of contacts
public class AdderssBook {
    private ArrayList<Contact> contactList = new ArrayList<>();

    // Method to add a contact to the address book
    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    // Method to display all contacts in the address book
    public void displayContacts() {
        for (Contact contact : contactList) {
            contact.displayContact();
        }
    }

    // Method to take user input and add a new contact
    public void addContactFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Contact Details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("State: ");
        String state = scanner.nextLine();

        System.out.print("ZIP: ");
        String zip = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        // Create a new contact object and add it to the address book
        Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addContact(newContact);
    }
}

