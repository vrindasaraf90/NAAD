package com.TypeConversion;

import java.util.Scanner;

public class IntTOString {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = a.nextInt();

        System.out.println("Enter another number: ");
        int num2 = a.nextInt();

        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);

        System.out.println(str1);
        System.out.println(str2);
    }
}
