package com.String;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mobile number: ");
        String text = sc.nextLine();

        String str1 = "123";
        String str2 = "09";

        boolean result = text.contains(str1);
        if(result) {
            System.out.println(str1 + " is present in the string.");
        }
        else {
            System.out.println(str1 + " is not present in the string.");
        }

        result = text.contains(str2);
        if(result) {
            System.out.println(str2 + " is present in the string.");
        }
        else {
            System.out.println(str2 + " is not present in the string.");
        }
    }
}
