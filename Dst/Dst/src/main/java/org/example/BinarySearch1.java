package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {

    public static void main(String[] args) {
        int[] a = new int[]{12,15,18,23,46,56,67,78,89,98};
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element to Search   ");
        x=sc.nextInt();
        System.out.println("Search Element Found at  " + Arrays.binarySearch(a,x));
    }
}
