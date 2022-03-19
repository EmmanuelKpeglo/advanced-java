package com.company.hackerrank;

public class StringToInteger {
    public static void convert(String string) {
        try {
            System.out.println(Integer.parseInt(string));
        }
        catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
