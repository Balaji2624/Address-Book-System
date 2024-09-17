package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

// Main class to interact with the user and manage the address book
public class AddressBookMain {
    public static void main(String[] args) {
        AdderssBook addressBook = new AdderssBook();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add New Contact");
            System.out.println("2. Edit Existing Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addressBook.addContactFromInput();
                    break;

                case "2":
                    System.out.print("Enter the first name of the contact to edit: ");
                    String firstName = scanner.nextLine();
                    addressBook.editContact(firstName);
                    break;

                case "3":
                    addressBook.displayContacts();
                    break;

                case "4":
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (!choice.equals("4"));
    }
}

