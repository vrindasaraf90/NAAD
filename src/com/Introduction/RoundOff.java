package com.Introduction;

import java.util.Scanner;

public class RoundOff {
    public static void main(String[] args) {
        double num = 1.9884567;

        Scanner a = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = a.nextInt();

        System.out.format("%.5f", num);
    }
}
