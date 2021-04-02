package com.String;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = sc.nextLine();

        System.out.println("Enter another string");
        String str2 = sc.nextLine();

        boolean result1 = (str1 == str2);
        System.out.println("Using == operator: " + result1);

        boolean result2 = str1.equals(str2);
        System.out.println("Using equals(): " + result2);
    }
}
