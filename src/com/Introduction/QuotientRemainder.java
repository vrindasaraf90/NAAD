package com.Introduction;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.println("Enter  divisor: ");
        int divisor = a.nextInt();

        System.out.println("Enter dividend: ");
        int dividend = a.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
