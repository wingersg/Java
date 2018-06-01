package com.tony;

public class Main {

    public static void main(String[] args) {
    	//width of int =32(4 bytes)
	int myIntValue = 5/2;
		//width of float =32(4 bytes)
	float myFloatValue = 5f/2f;
	//width of float =64(8 bytes)
	double myDoubleValue = 5d/3;
	System.out.println("myIntValue= " + myIntValue);
	System.out.println("myFloatValue= " + myFloatValue);
	System.out.println("myDoubleValue= " + myDoubleValue);

	double numPounds=200;
	double convertedKilograms=numPounds*0.45359237;
	System.out.println(numPounds + " pounds corresponds to: "+ convertedKilograms + " kilograms" );
    }
}
