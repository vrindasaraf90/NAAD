package com.String;

import java.util.Scanner;

public class FirstLetterCapital {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any string: ");
        String str = sc.nextLine();

        String firstLetter = str.substring(0, 1);
        String remainingLetters = str.substring(1, str.length());

        firstLetter = firstLetter.toUpperCase();

        str = firstLetter + remainingLetters;
        System.out.println("String: " + str);
    }
}
