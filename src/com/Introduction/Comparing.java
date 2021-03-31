package com.String;

import java.util.Scanner;

public class Comparing {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string: ");
        String style1 = sc.nextLine();

        System.out.println("Enter another string: ");
        String style2 = sc.nextLine();

        if (style1.equals(style2))
            System.out.println("Both strings are equal.");
        else
            System.out.println("Both strings are not equal.");
    }
}
