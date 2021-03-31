package com.Array;

public class Average {
    public static void main(String[] args){

        double[] arr = {1.1, 2.2, 3.3, 4.4, 5.5};
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double average = sum / arr.length;

        System.out.println("The average is: " + average);

    }
}
