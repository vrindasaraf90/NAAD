package com.Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter anumber to be Reversed: ");
        int num = a.nextInt();

        int reversed = 0;

        while(num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }

}
