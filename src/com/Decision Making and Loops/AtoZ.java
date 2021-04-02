package com.Loops;

public class AtoZ {
    public static void main(String[] args) {

        char c;
        char C;


        for(c = 'a'; c <= 'z'; ++c)
            System.out.print(c + " ");

        System.out.println();

        for(C = 'A'; C <= 'Z'; ++C)
            System.out.print(C + " ");
    }
}
