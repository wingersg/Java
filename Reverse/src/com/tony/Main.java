package com.tony;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("The original array is:"+Arrays.toString(array));
        reverse(array);
    }

    public static void reverse(int[] array){
//        int[] reverseArray= new int[array.length];
        int[] reverseArray = Arrays.copyOf(array,array.length);
        for(int i=0;i<array.length;i++){
            reverseArray[i]=array[array.length-i-1];
        }
        System.out.println("The reversed assay is:"+ Arrays.toString(reverseArray));
    }
}
