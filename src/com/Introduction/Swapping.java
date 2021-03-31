package com.Introduction;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNum = a.nextInt();

        System.out.println("Enter another number: ");
        int secondNum = a.nextInt();

        int temporary = firstNum;
        firstNum = secondNum;
        secondNum = temporary;

        System.out.println("After Swapping result is: ");
        System.out.println("The first number is: " + firstNum);
        System.out.println("The second number is: " + secondNum);


    }
}
