package com.tony;

public class Main {

    public static void main(String[] args) {
        //width of 16(2 bytes)
	char myChar = '\u00A7';
	System.out.println("Unicode output is "+ myChar);
	boolean isMale = true;
	System.out.println("the boolean is: " + isMale);

	char registeredSymbol='\u00AE';
	System.out.println("The symbol is "+ registeredSymbol);
    }
}
