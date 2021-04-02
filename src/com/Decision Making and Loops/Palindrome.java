package com.Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Enter any Integer: ");
        int num = n.nextInt();
        int originalInt = num;

        int reversedInteger = 0, remainder;

        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        if (originalInt == reversedInteger)
            System.out.println(originalInt + " is a palindrome.");
        else
            System.out.println(originalInt + " is not a palindrome.");
    }
}
