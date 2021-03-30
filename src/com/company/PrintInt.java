package com.company;
import java.util.Scanner;

public class PrintInt {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = s.nextInt();

        System.out.println("The Integer you entered: " + number);

    }
}
