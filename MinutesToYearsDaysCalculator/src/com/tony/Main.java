package com.tony;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //printYearsAndDays(-561600);
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }
    public static void printYearsAndDays(long minutes) {
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            long years = ((minutes/60)/24)/365;
            long days  = ((minutes/60)/24)%365;
            System.out.println(minutes+" min = "+ years +"y and "+days+" d");
        }

    }

    public static boolean isCatPlaying(boolean summer,int temperature) {
        if(summer  && temperature>=25 && temperature<=45){
            return true;
        }else if(!summer && temperature>=25 && temperature<=35) {
            return true;
        }else {
            return false;
        }
    }

}
