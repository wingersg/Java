package com.tony;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have "+groceryList.size()+" items in your list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+"."+groceryList.get(i));
        }
    }

    //overloaded function
    public void modifyGroceryItem(String currentItem,String newItem){
        int position = findItem(currentItem);
        if(position>=0){
            System.out.println("Grocery item "+groceryList.get(position));
            modifyGroceryItem(position,newItem);
        }
    }
// forcing the people using this class
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println(" has been modified to "+newItem);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position>=0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
            return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position>=0){
            return true;
        }
        return false;
    }
}
