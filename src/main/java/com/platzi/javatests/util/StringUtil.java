package com.platzi.javatests.util;

public class StringUtil {
    public static String repeat(String str, int time){
       if (time<0){
           throw new IllegalArgumentException("Negative times not alllowed");
       }
        String result = "";

        for (int i = 0; i < time; i++) {
            result += str;
        }


        return  result;
    }

    public  static boolean isEmpty(String str){
        if (str == null) return true;
        return str.trim().length()==0;
    }

}
