package com.String;

import java.util.Scanner;

public class IfStringIsNumeric {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.nextLine();

        boolean numeric = true;

            try {
                double num = Double.parseDouble(str);
            } catch (NumberFormatException numberFormatException) {
                numeric = false;
            }
            if (numeric)
                System.out.println(str + " is numeric");
            else
                System.out.println(str + " is not numeric");


        }
}
