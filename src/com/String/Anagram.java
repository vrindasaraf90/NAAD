package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string: ");
        String style1 = sc.nextLine();

        System.out.println("Enter another string: ");
        String style2 = sc.nextLine();

        if (style1.length() == style2.length()) {

            char[] charArray1 = style1.toCharArray();
            char[] charArray2 = style2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(style1 + " and " + style2 + " are anagram.");
            } else {
                System.out.println(style1 + " and " + style2 + " are not anagram.");
            }
        } else {
            System.out.println(style1 + " and " + style2 + " are not anagram.");

        }
    }
}
