package com.tony;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
	int myMinValue = -2_147_483_648;
	int myMaxValue = 10;
        // byte has a width of 8
	byte myByteValue = 20;
	byte myNewByteValue = (byte)(myByteValue/2);
	System.out.println("myNewByteValue = " + myNewByteValue);
        // short has a width of 16
	short myShortValue= 50;
	// long has a width of 64
	long myLongValue = 9_223_372_036_854_775_807L;
	long myNewLongValue = 50000L + 10L*(myByteValue+myShortValue+myMaxValue);
	short myNewShortValue = (short)(1000 + 10*(myByteValue+myShortValue+myMaxValue));
	System.out.println("myNewLongValue is: " + myNewLongValue);
		System.out.println("myNewShortValue is: " + myNewShortValue);
    }
}
