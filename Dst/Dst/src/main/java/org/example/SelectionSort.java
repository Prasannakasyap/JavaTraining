package org.example;

import java.util.Arrays;

public class SelectionSort {
    public static void selection_sort(int a[]) {
        int len = a.length;
        int t;
        for(int i=0;i<len-1;i++) {
            int min=i;

            for(int j=i+1;j<len;j++) {
                if (a[j] < a[min]) {
                    min=j;
                }
            }
            t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
    }
    public static void main(String[] args) {
        int[] a={54,23,24,66,77,43,81,71,91,88};
        selection_sort(a);
        System.out.println(Arrays.toString(a));
    }
}
