package com.Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter no of terms: ");
        int n = a.nextInt();

        int t1 = 0;
        int t2 = 1;

        System.out.println("First " + n + " terms");

        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + ",");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;


        }
    }
}
