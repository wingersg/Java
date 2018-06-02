package com.tony;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int num=-12;
        System.out.println("reverse of "+num+" is "+reverse(num));
        System.out.println("number of digit for "+num+" is "+getDigitCount(num));
        numberToWords(num);
    }

    public static int reverse(int number) {
        int reverse=0;
        while(number>=1 || number<=-1) {
            reverse=10*reverse+number%10;
            number /=10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        int count=0;
        if(number<0){
            return -1;
        }else if (number==0){
            return 1;
        }else
            {
            while(number>=1){
                count++;
                number /=10;
            }
            return count;
        }
    }

    public static void numberToWords(int number) {

        int revnum=reverse(number);

        if(number<0){
            System.out.println("Invalid Value");
        }else if(number==0){
            System.out.println("Zero");
        }

        else{
            while(revnum>=1){
                switch(revnum%10){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                revnum /=10;
            }
        }

        int numzero=getDigitCount(number)-getDigitCount(reverse(number));
        for(int i=1;i<=numzero;i++){
            System.out.println("Zero");
        }

    }
}
