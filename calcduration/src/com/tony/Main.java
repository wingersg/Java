package com.tony;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(999999999,59));
        System.out.println(getDurationString(192000000));

    }
    public static String  getDurationString(long mm,long ss) {
        if(mm<0 || ss<0 || ss>59){
            return "invalid value";
        }
        String hours;
        String minutes;
        String seconds;
        if(mm/60<10){
            hours= "0"+ mm/60;
        }else{
            hours = ""+ mm/60;
        }

        if(mm%60<10){
            minutes= "0"+ mm%60;
        }else{
            minutes= "" + mm%60;
        }

        if(ss<10){
            seconds="0"+ss;
        }else{
            seconds=""+ss;
        }

        String result= hours+"h "+minutes+"m "+seconds+"s";
        return result;

    }

    public static String  getDurationString(long ss) {
        if(ss<0){
            return "invalid value";
        }
        long minutes = ss/60;
        long seconds = ss%60;
         return getDurationString(minutes,seconds);
    }
}
