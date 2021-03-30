package com.company;

public class LargestNumber {
    public static void main(String[] args) {
        double n1 = 5.5;
        double n2 = 79.0;
        double n3 = 2.5;

        if (n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
