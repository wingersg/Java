package com.tony;

public class Main {

    public static void main(String[] args) {
	// write your code here
       calcFeetAndInchesToCentimeters(1,-1);
        calcFeetAndInchesToCentimeters(11);
    }

    public static double calcFeetAndInchesToCentimeters(double paramFeet,double paramInch){
        if(paramFeet<0 || paramInch<0 || paramInch >12) {
            System.out.println("invalid entry,try again!");
            return -1;
        }

        double centimeter = 12*2.54*paramFeet+2.54*paramInch;
        System.out.println(paramFeet+" feet,"+paramInch+" inches corresponds to " +centimeter+"cm");
        return centimeter;
    }

    public static double calcFeetAndInchesToCentimeters(double paramInch){
        if( paramInch<0 || paramInch >12) {
            System.out.println("invalid entry for inches, please try again");
            return -1;
        }
         int feet = (int)(paramInch/12);
         int inches =(int)(paramInch)%12;
         System.out.println(paramInch+" inches=" + feet + "feet and " + inches + " inches");
         System.out.println(paramInch+" inches= "+paramInch*2.54 +" cm" );
        return paramInch*2.54;
    }

}
