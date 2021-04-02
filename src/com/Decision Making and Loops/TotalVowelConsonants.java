package com.Loops;

import java.util.Locale;
import java.util.Scanner;

public class TotalVowelConsonants {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("Enter a string:  ");
        String str = a.nextLine();
        str = str.toLowerCase(Locale.ROOT);

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ++consonants;
            }
        }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);



    }
}
