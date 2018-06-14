package com.tony;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        //int [] myIntArray = new int[10];
        int[] myIntArray = new int[25];// {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array){
            for(int i=0;i<array.length;i++){

                System.out.println("Element "+i+",value is "+array[i]);
            }
        }

    }

