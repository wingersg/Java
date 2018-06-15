package com.tony;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        int choice =0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice(0-6):");
            choice = scanner.nextInt();
            String entry=Integer.toString(choice);

            Pattern p = Pattern.compile("[0-7]+");
            Matcher m = p.matcher(entry);
            if (!m.find()){
                System.out.println("invalid choice, try again!");
            }
                // match

            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    System.out.println("exiting the program....");
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0-Menu");
        System.out.println("\t 1-List");
        System.out.println("\t 2-Add");
        System.out.println("\t 3-Modify");
        System.out.println("\t 4-Remove");
        System.out.println("\t 5-Search");
        System.out.println("\t 7-Exit");
    }

    public static void addItem(){
        System.out.println("Please enter the grocery item:");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter the item name to be modified:");
        String currentItem = scanner.nextLine();
        System.out.println("Enter new item name for replacement:");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem,newItem);
    }


    public static void removeItem(){
        System.out.println("Which item do you want to drop?");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to search for:");
        String searchItem =scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found "+searchItem+"in the list");
        }else{
            System.out.println(searchItem+"is not file");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        // make a copy of the arrayList
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        // convert the arrayList back to array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
