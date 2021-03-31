package com.company;
import java.util.Scanner;

public class AddInteger {
    public static void main(String[] args) {

        Scanner add = new Scanner(System.in);
        System.out.println("Enter an number; ");
        int num1 = add.nextInt();

        System.out.println("Enter another number: ");
        int num2 = add.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is " + sum);

    }
}
