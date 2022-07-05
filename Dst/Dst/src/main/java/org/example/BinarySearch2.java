package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearch2 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(30);
        numbers.add(42);
        numbers.add(49);
        numbers.add(51);
        numbers.add(53);
        numbers.add(63);
        numbers.add(67);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to Search  ");
        int n = sc.nextInt();
        int pos = Collections.binarySearch(numbers,n);
        System.out.println("Position  " +pos);
    }
}
