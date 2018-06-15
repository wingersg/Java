package com.tony;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilepPhone = new MobilePhone("0039 330 4404");


    boolean quit = false;

    {
        System.out.println("\n Enter action:(6 to show available actions:");
        int action = scanner.nextInt();
        scanner.nextLine();
        switch (action) {
            case 0:
                System.out.println("\n Shutting down...");
                quit = true;
                break;
            case 1:
                MobilePhone.printContacts();
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

    startPhone();
    while(!quit)

    printActions();

    private static void addNewContact() {
        System.out.println("Enter new contact name:");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number:");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
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
