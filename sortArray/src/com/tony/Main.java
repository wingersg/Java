package com.tony;

import java.util.Scanner;

// 06/14/2018
public class Main {
    private static Scanner scanner1= new Scanner(System.in);
    private static Scanner scanner2= new Scanner(System.in);

    public static void main(String[] args) {
		    // Create a program using arrays that sorts a list of integers in descending order.
                // Descending order is highest value to lowest.
                // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
                // ultimately have an array with 106,81,26, 15, 5 in it.
                // Set up the program so that the numbers to sort are read in from the keyboard.
                // Implement the following methods - getIntegers, printArray, and sortIntegers
                // getIntegers returns an array of entered integers from keyboard
                // printArray prints out the contents of the array
                // and sortIntegers should sort the array and return a new array containing the sorted numbers
                // you will have to figure out how to copy the array elements from the passed array into a new
                // array and sort them and return the new sorted array.
        System.out.println("Please enter n numbers:");
        int[] newarray=getIntegers(scanner2.nextInt());
        System.out.println("the unsorted array is:");
        printArray(newarray);
        System.out.println("the sorted array is:");
        int[] sortedarray= sortIntegers(newarray);
        printArray(sortedarray);


    }

    public static int[] getIntegers(int number){

        int[] array = new int[number];
        for(int i=0;i<array.length;i++){
            System.out.println("Please enter a number:");
            array[i]=scanner1.nextInt();
            System.out.println("The "+i+"th number is "+ array[i]);
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+" is "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            sortedArray[i] = array[i];
        }

        boolean flag= true;
        int temp;

        while(flag){
            flag= false;
            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
        }

    }
