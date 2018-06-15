package com.tony;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

public static void main(String[] args) {

    boolean quit = false;
    startPhone();
    printActions();
    while (!quit) {
        System.out.println("\n Enter action:(6 to show available actions:");
        int action = scanner.nextInt();
        scanner.nextLine();
        switch (action) {
            case 0:
                System.out.println("\n Shutting down...");
                quit = true;
                break;
            case 1:
                mobilePhone.printContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                queryContact();
                break;
            case 6:
                printActions();
                break;
        }

    }
}

    private static void addNewContact() {
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number:");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if (mobilePhone.addNewContact((newContact))) {
            System.out.println("New contact added: name=" + name + ",phone= " + phone);

        } else {
            System.out.println("Can not add" + name + ",already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        System.out.println("Enter new contact name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number:");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("successfully updated!");
        } else {
            System.out.println("error updating record!");
        }
    }



    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("successfully removed!");
        } else {
            System.out.println("error deleting record!");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found!");
            return;
        }
        System.out.println("Name:"+existingContactRecord.getName()+" phone number is "+existingContactRecord.getPhoneNumber());
    }


    private static void startPhone() {
        System.out.println("Starting phone....");
    }

    private static void printActions() {
        System.out.println("\n Available actions :\n press");
        System.out.println("0-shutdown\n" +
                "1-print contacts\n" +
                "2-add new\n" +
                "3-update\n" +
                "4-remove\n" +
                "5-query\n" +
                "6-option\n");
        System.out.println("Choose your action:");
    }

}

