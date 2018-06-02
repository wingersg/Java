package com.tony;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(7);
	// write your code here
        char charValue='A';
        printNumberInWord(1);
        System.out.println(isLeapYear(-1600));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2,2020));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2020));
        System.out.println(getDaysInMonth(1,-2020));
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("C or D or E was found");
                break;

            default:
                System.out.println("could not find A,B,C,D or E");
        }
    }



    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("invalid day");


        }
    }

    public static void printNumberInWord(int number) {
        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static boolean isLeapYear(int year) {
        if(year<1 || year>9999){
            return false;
        }else if(year%4==0 && year%100!=0){
            return true;
        }else if(year%400==0){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month,int year) {
        if(month<1||month>12||year<1||year>9999){
            return -1;
        }else{
            switch(month) {
                case 2:
                    if(isLeapYear(year)){
                        return 29;
                    }else {
                        return 28;
                    }
                case 1:case 3:case 5:case 7:case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
        }
            }
            return -1;
        }

}
