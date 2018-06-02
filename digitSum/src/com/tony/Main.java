package com.tony;

//    Write a method with the name sumDigits that has one int parameter called number.
//
//            If parameter is >= 10 then the method should process the number and return sum of all digits, otherwise return -1 to indicate an invalid value.
//
//            The numbers from 0-9 have 1 digit so we don乫t want to process them, also we don乫t want to process negative numbers, so also return -1 for negative numbers.
//
//            For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
//
//            Calling the method sumDigits(1) should return -1 as per requirements described above.
//
//            Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
//
//            Hint:
//            Use n % 10 to extract the least-significant digit.
//            Use n = n / 10 to discard the least-significant digit.
//            The method needs to be static like other methods so far in the course.
//
//        Tip:
//        Create a project with the name DigitSumChallenge.
public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(digitsum(-2));
//        System.out.println("-1221 is palindrome? "+ ispalindrome(-1221));
//        int input=1221;
//        System.out.println(input/10);
//        System.out.println(input+" is palindrome? "+ ispalindrome(input));
//        System.out.println("11212 is palindrome? "+ ispalindrome(11212));

        int input=-10;
        System.out.println("sum of 1st and last of "+input+"="+sumFirstAndLastDigit(input));

    }

    public static int digitsum(int n) {
        if(n<10 && n>=0) {
            return n;
        }
        if(n<0) {
            return -1;
        }

        int sum=0;
            while(n>=1) {
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }

    public static boolean ispalindrome(int number){
        int reverse=0;
        int orignum=number;
        while(Math.abs(number)>=1){
            reverse=10*reverse+(number%10);
            number=number/10;
        }

        if(reverse == orignum){
            return true;
        }else{
            return false;
        }
    }

    //sum first and last digit

    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int firstnum = number%10;
//        System.out.println("first="+firstnum);
        while(number>9) {
            number/=10;
        }
//        System.out.println("last="+number);
        return number+firstnum;
    }
}



