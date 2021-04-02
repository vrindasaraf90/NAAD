package com.Introduction;

import java.util.Scanner;

public class ASCIIvalue {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = a.next().charAt(0);

        int ascii = ch;
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);

    }
}
