package com.Loops;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter any Integer");
        int num = a.nextInt();

        int count = 0;

        while (num != 0) {
            num = num / 10;
            ++count;
        }
        System.out.println("Number of digits are: " + count);
    }
}
