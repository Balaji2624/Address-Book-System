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
    public void addMultipleContactsFromInput() {
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
    public void editContact(String firstName) {
        Scanner scanner = new Scanner(System.in);

        // Search for the contact by name
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("Editing Contact: " + contact.getFirstName() + " " + contact.getLastName());

                System.out.print("Enter New First Name (or press Enter to keep current): ");
                String newFirstName = scanner.nextLine();
                if (!newFirstName.isEmpty()) {
                    contact.setFirstName(newFirstName);
                }

                System.out.print("Enter New Last Name (or press Enter to keep current): ");
                String newLastName = scanner.nextLine();
                if (!newLastName.isEmpty()) {
                    contact.setLastName(newLastName);
                }

                System.out.print("Enter New Address (or press Enter to keep current): ");
                String newAddress = scanner.nextLine();
                if (!newAddress.isEmpty()) {
                    contact.setAddress(newAddress);
                }

                System.out.print("Enter New City (or press Enter to keep current): ");
                String newCity = scanner.nextLine();
                if (!newCity.isEmpty()) {
                    contact.setCity(newCity);
                }

                System.out.print("Enter New State (or press Enter to keep current): ");
                String newState = scanner.nextLine();
                if (!newState.isEmpty()) {
                    contact.setState(newState);
                }

                System.out.print("Enter New ZIP (or press Enter to keep current): ");
                String newZip = scanner.nextLine();
                if (!newZip.isEmpty()) {
                    contact.setZip(newZip);
                }

                System.out.print("Enter New Phone Number (or press Enter to keep current): ");
                String newPhoneNumber = scanner.nextLine();
                if (!newPhoneNumber.isEmpty()) {
                    contact.setPhoneNumber(newPhoneNumber);
                }

                System.out.print("Enter New Email (or press Enter to keep current): ");
                String newEmail = scanner.nextLine();
                if (!newEmail.isEmpty()) {
                    contact.setEmail(newEmail);
                }

                System.out.println("Contact updated successfully!");
                return;
            }
        }
        // If no contact is found
        System.out.println("Contact with name " + firstName + " not found.");
    }
    public void deleteContact(String firstName) {
        Contact contactToDelete = null;

        // Search for the contact by name
        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contactToDelete = contact;
                break;
            }
        }

        // Delete the contact if found
        if (contactToDelete != null) {
            contactList.remove(contactToDelete);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact with name " + firstName + " not found.");
        }
    }
}

