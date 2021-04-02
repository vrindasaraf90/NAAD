package com.String;

import java.util.Scanner;

public class EachCharacterOfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.nextLine();

        System.out.println("The characters in the input are:");

        for (int i = 0; i < input.length(); i++){
            char s = input.charAt(i);
            System.out.print( s + " ; ");
        }



    }
}

