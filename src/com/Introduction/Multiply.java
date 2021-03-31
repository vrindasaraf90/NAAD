package com.Introduction;
import java.util.Scanner;

public class Multiply {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.println("Enter a float number: ");
        float num1 = a.nextFloat();

        System.out.println("Enter another float number: ");
        float num2 = a.nextFloat();

        float product = num1 * num2;
        System.out.println("The product is: " + product);


    }
}
