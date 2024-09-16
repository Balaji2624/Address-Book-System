package com.bridgelabz.addressbooksystem;

public class AdderssBook {
    public static void main(String[] args)
    {

                Contact contact1 = new Contact("John", "Doe", "123 Elm Street", "Springfield", "IL", "62701", "555-1234", "john.doe@example.com");
                Contact contact2 = new Contact("Jane", "Smith", "456 Oak Street", "Metropolis", "NY", "10001", "555-5678", "jane.smith@example.com");
                Contact contact3 = new Contact("Alice", "Johnson", "789 Pine Street", "Gotham", "NJ", "07001", "555-4321", "alice.johnson@example.com");

                contact1.displayContact();
                contact2.displayContact();
                contact3.displayContact();

    }
}
