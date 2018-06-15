package com.tony;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] strArray = new String[10];
        int[] intArray = new int[10];
        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Emily");

//        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();

        intArrayList.add(new IntClass(54));
        Integer integer = 54;// new Integer(54);
        Double doubleValue = new Double(12.25);
ArrayList<Integer> intArrayList1 = new ArrayList<Integer>();
// auto-boxing
for(int i=0;i<=10;i++){
    intArrayList1.add(Integer.valueOf(i));
}
// unboxing
        for(int i=0;i<=10;i++){
            System.out.println(i+"-->"+intArrayList1.get(i).intValue());
        }
    }
}
