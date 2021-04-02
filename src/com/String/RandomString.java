package com.String;

import java.util.Random;

public class RandomString {
    public static void main(String[] args) {

        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String number = "1234567890";
        String total = uppercase + lowercase + number;

        StringBuilder sb = new StringBuilder();

        Random random = new Random();

        int length = 7;

        for(int i = 0; i < length; i++) {

            int index = random.nextInt(total.length());

            char randomChar = total.charAt(index);

            sb.append(randomChar);
        }
        String randomString = sb.toString();
        System.out.println("Random String is: " + randomString);

    }
}
