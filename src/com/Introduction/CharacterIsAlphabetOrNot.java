package com.Loops;

import java.util.Scanner;

public class CharacterIsAlphabetOrNot {
    public static void main(String[] args){

        Scanner ch = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = ch.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");


    }
}
