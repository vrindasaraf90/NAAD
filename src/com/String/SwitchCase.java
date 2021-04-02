package com.String;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any one: Vrinda; School; College or type anything");
        String str = sc.nextLine();

        switch (str){

            case "Vrinda":
                System.out.println( str + " Sarraf :)");
                break;
            case "School":
                System.out.println( str + " The Palace School");
                break;
            case "College":
                System.out.println( str + " JECRC Univesity");
                break;
            default:
                System.out.println("Have a good day!");
        }
    }
}
