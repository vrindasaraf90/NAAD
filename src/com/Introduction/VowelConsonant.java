package com.Introduction;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.println("Enter any alphabet: ");
        char ch = a.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Given alphabet is a Vowel");
        else
            System.out.println("Given alphabet is a Consonant");
            System.out.println("Given alphabet is a Consonant");

    }
}
