package com.AddressBookSystem;

import java.util.*;

public class AddressBook {
    static List<ContactDetails> collection = new ArrayList<ContactDetails>();
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book System code !!!");
        //List<ContactDetails> collection = new ArrayList<ContactDetails>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY");
            System.out.println("3.UPDATE ");
            System.out.println("4.Delete");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addContacts();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    updateContactDetails();
                    break;
                case 4:
                    deleteContacts();
                    break;
                default:
                    System.out.println("default");
            }
        } while (choice != 0);
    }

    private static void addContacts() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName1 = sc1.nextLine();
        System.out.print("Enter last Name: ");
        String lastName = sc1.nextLine();
        System.out.print("Enter your address: ");
        String address = sc1.nextLine();
        System.out.print("Enter your city: ");
        String city = sc1.nextLine();
        System.out.print("Enter your state: ");
        String state = sc1.nextLine();
        System.out.print("Enter your EMail ID: ");
        String emailId = sc1.nextLine();
        System.out.print("Enter zip code : ");
        int zip = sc.nextInt();
        System.out.print("Enter phone number: ");
        int phoneNumber = sc.nextInt();
        ContactDetails contactDetails = new ContactDetails(firstName1, lastName, address, city, state, zip, phoneNumber, emailId);
        collection.add(contactDetails);
    }

    private static void displayContacts() {
        System.out.println("-----------------------------");
        Iterator<ContactDetails> i = collection.iterator();
        while (i.hasNext()) {
            ContactDetails contactDetails = i.next();
            System.out.println(contactDetails);
        }
        System.out.println("------------------------------------");
    }

    private static void updateContactDetails() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter first name of the person for update ");
        String firstName = sc1.nextLine();
        System.out.println("------------------------------------");

        ListIterator<ContactDetails> listIterator = collection.listIterator();

        while (listIterator.hasNext()) {
            ContactDetails contactDetails = listIterator.next();

            if (contactDetails.getFirstName().equals(firstName)) {

                System.out.print("Enter new last Name: ");
                String lastName = sc1.nextLine();
                System.out.print("Enter your new address: ");
                String address = sc1.nextLine();
                System.out.print("Enter your new city: ");
                String city = sc1.nextLine();
                System.out.print("Enter your state: ");
                String state = sc1.nextLine();
                System.out.print("Enter zip code : ");
                int zip = sc.nextInt();
                System.out.print("Enter phone number: ");
                int phoneNumber = sc.nextInt();
                System.out.print("Enter your EMail ID: ");
                String emailId = sc1.nextLine();
                listIterator.set(new ContactDetails(firstName, lastName, address, city, state, zip, phoneNumber, emailId));
                found = true;
            }
        }
        System.out.println("------------------------------------");

        if (!found) {
            System.out.println("Record not found");
        } else {
            System.out.println("Record is updated successfully");
        }
        System.out.println("------------------------------------");
    }

    private static void deleteContacts() {
        Scanner sc1 = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter first name of the person for delete ");
        String firstName = sc1.nextLine();
        System.out.println("------------------------------------");
        Iterator<ContactDetails> i = collection.iterator();
        while (i.hasNext()) {
            ContactDetails contactDetails = i.next();
            if (contactDetails.getFirstName().equals(firstName)) {
                i.remove();
                found = true;
            }
        }
        System.out.println("------------------------------------");
        if (!found) {
            System.out.println("Record not found");
        } else {
            System.out.println("Record is deleted successfully");
        }
        System.out.println("------------------------------------");
    }
}
