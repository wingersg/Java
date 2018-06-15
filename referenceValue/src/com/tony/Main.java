package com.tony;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=10;
        int b=a;
        System.out.println(a);
        System.out.println(b);
        b++;
        System.out.println(a);
        System.out.println(b);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray= "+ Arrays.toString(anotherArray));

        anotherArray[0]=1;
        System.out.println("after change myIntArray= "+ Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= "+ Arrays.toString(anotherArray));
    }
}
