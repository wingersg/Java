package com.tony;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
// -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
// -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//  -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
// -Finally, print the minimum element in the array.
// Tips:
// -Assume that the user will only enter numbers, never letters
// -For simplicity, create a Scanner as a static field to help with data input
// -Create a new console project with the name 乪MinElementChallenge乫
        System.out.println("Please enter the number of items in an array:");
        int count=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter "+count+" numbers one-by-one:");
       int[] myarray= readIntegers(count);
       int min = findMin(myarray);
        System.out.println("The minimum value of this array is:" + min);

    }


    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i=0;i<count;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;

    }


}
