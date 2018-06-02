package com.tony;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum=0;
        int num=0;
        System.out.println("The odd sum is "+sumOdd(1,11));
//        System.out.println("The odd sum is "+sumOdd(-1,100));
//        System.out.println("The odd sum is "+sumOdd(100,100));
//        System.out.println("The odd sum is "+sumOdd(100,-100));
//        System.out.println("The odd sum is "+sumOdd(100,1000));

        for(int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i);
                sum+=i;
                num++;
            }
            if(num==5){
                System.out.println("sum is "+sum);
                break;
            }

        }





        int count=0;
        System.out.println(isPrime(7));
        for(int i=1;i<=100;i++) {
            if(isPrime(i)){
                System.out.println(i);
                count++;
                if(count==10){
                    break;
                }
            }
        }
    }



    public static boolean isPrime(int n) {
        if(n==1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int number) {
        if(number<0){
            return false;
        }else if(number%2!=0){
            return true;
        }else{
            return false;
        }
    }

    public static int sumOdd(int start,int end) {
        if(start<=0 || end<=0 || start>end){
            return -1;
        }

        int sum=0;
       for(int i=start;i<=end;i++){
            if(isOdd(i)){
                System.out.println(i);
                sum +=i;
            }
       }
       return sum;
    }
}
