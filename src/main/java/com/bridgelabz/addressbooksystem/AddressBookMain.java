package com.bridgelabz.addressbooksystem;

import java.util.Scanner;

// Main class to interact with the user and manage the address book
public class AddressBookMain {
    public static void main(String[] args) {
        AdderssBook addressBook = new AdderssBook();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            addressBook.addContactFromInput();

            System.out.print("Do you want to add another contact? (yes/no): ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        // Display all contacts
        System.out.println("\nContacts in Address Book:");
        addressBook.displayContacts();

        scanner.close();
    }
}

