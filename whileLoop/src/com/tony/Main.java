package com.tony;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int number=4;
        int finishnumber=20;

        while(number<finishnumber){
            number++;
            if (isEven(number)) {
                continue;
            }
            System.out.println("Even number"+number);
        }
    }

    public static boolean isEven(int num) {
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }
}
