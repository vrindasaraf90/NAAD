package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args){

        Scanner a = new Scanner(System.in);

        int n1 = 5;
        int n2 = 5;

        int[] arr1 = new int[5];
        System.out.println("Enter elements of array1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = a.nextInt();
        }

        int[] arr2 = new int[5];
        System.out.println("Enter elements of array2: ");
        for (int j = 0; j < n2; j++){
            arr2[j] = a.nextInt();
        }

        int arr1len = arr1.length;
        int arr2len = arr2.length;
        int[] totallen = new int[arr1len + arr2len];

        System.arraycopy(arr1, 0, totallen, 0,arr1len);
        System.arraycopy(arr2, 0, totallen,arr1len, arr2len);

        System.out.println(Arrays.toString(totallen));
    }
}
