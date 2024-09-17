package com.bridgelabz.addressbooksystem;

import java.util.HashMap;
import java.util.Scanner;

// Main class to interact with the user and manage the address book
public class AddressBookMain {
    private static HashMap<String, AdderssBook> addressBookSystem = new HashMap<>();
    public static void main(String[] args) {

        AdderssBook addressBook = new AdderssBook();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add New Contact");
            System.out.println("2. Edit Existing Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Add a new Address Book
                    System.out.print("Enter Address Book Name: ");
                    String addressBookName = scanner.nextLine();
                    if (!addressBookSystem.containsKey(addressBookName)) {
                        AdderssBook newAddressBook = new AdderssBook();
                        addressBookSystem.put(addressBookName, newAddressBook);
                        System.out.println("Address Book '" + addressBookName + "' added successfully.");
                    } else {
                        System.out.println("Address Book with this name already exists.");
                    }
                    break;

                case "2":
                    // Select an Address Book
                    System.out.print("Enter Address Book Name: ");
                    String selectedAddressBookName = scanner.nextLine();
                    AdderssBook selectedAddressBook = addressBookSystem.get(selectedAddressBookName);

                    if (selectedAddressBook != null) {
                        manageAddressBook(selectedAddressBook);
                    } else {
                        System.out.println("Address Book '" + selectedAddressBookName + "' not found.");
                    }
                    break;

                case "3":
                    // Display all Address Books
                    System.out.println("List of Address Books:");
                    for (String name : addressBookSystem.keySet()) {
                        System.out.println("- " + name);
                    }
                    break;

                case "4":
                    // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }

    // Method to manage a selected address book
    private static void manageAddressBook(AdderssBook addressBook) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Choose an option for the selected Address Book:");
            System.out.println("1. Add Multiple Contacts");
            System.out.println("2. Edit Existing Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addressBook.addMultipleContactsFromInput();
                    break;

                case "2":
                    System.out.print("Enter the first name of the contact to edit: ");
                    String firstNameToEdit = scanner.nextLine();
                    addressBook.editContact(firstNameToEdit);
                    break;

                case "3":
                    System.out.print("Enter the first name of the contact to delete: ");
                    String firstNameToDelete = scanner.nextLine();
                    addressBook.deleteContact(firstNameToDelete);
                    break;

                case "4":
                    addressBook.displayContacts();
                    break;

                case "5":
                    System.out.println("Returning to Main Menu...");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (!choice.equals("5"));
    }
}

