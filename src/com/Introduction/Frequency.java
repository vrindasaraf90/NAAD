package com.Introduction;

public class Frequency {
    public static void main(String[] args){

        String str = "My Name is Vrinda Sarraf";
        char ch = 'a';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++){
            if( ch == str.charAt(i) ){
                frequency++;
            }
        }
        System.out.println("Frequency of 'a' is: " + frequency);

    }
}
