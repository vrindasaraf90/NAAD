package com.Introduction;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = a.nextInt();

        if (number % 2 == 0)
            System.out.println("The number you entered is Even");
        else
            System.out.println("The number you entered is Odd");
    }
}
