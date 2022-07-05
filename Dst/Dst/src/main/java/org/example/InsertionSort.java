package org.example;

import java.util.Arrays;

public class InsertionSort {

    public static void insertion_sort(int[] a) {
        for(int k=1;k<a.length;k++) {
            int temp = a[k];
            int j=k-1;

            while(j >=0 && temp <= a[j]) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
        public static void main(String[] args) {
        int[] a={54,23,24,66,77,43,81,71,91,88};
        insertion_sort(a);
        System.out.println("Sorted Array   " + Arrays.toString(a));

        }
}
