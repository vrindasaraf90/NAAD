package com.Introduction;

public class EmptyString {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";

        if(isNullOrEmpty(str1))
            System.out.println("First string is null or empty.");
        else
            System.out.println("First string is not null or empty.");

        if(isNullOrEmpty(str2))
            System.out.println("Second string is null or empty.");
        else
            System.out.println("Second string is not null or empty.");
    }

    public static boolean isNullOrEmpty(String str) {
        if(str != null && !str.isEmpty())
            return false;
        return true;
    }
}
