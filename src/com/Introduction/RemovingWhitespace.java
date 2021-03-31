package com.Introduction;
import java.util.Scanner;
public class RemovingWhitespace {
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");


            String input = sc.nextLine();
            System.out.println("Original String: " + input);

            input = input.replaceAll("\\s", "");
            System.out.println("Final String: " + input);
            sc.close();
    }

    }
