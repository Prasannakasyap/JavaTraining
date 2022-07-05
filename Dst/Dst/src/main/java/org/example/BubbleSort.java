package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {

    public static void printArray(int[] array) {
        String result = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println(result);
    }

    public static void bubble_sort(int[] a, boolean flag) {
        int len = a.length;
        int t;
        if (flag==true) {
            for(int i=0;i<len-1;i++) {
                for(int j=i+1;j<len;j++) {
                    if (a[i] > a[j]) {
                        t=a[j];
                        a[j]=a[i];
                        a[i]=t;
                    }
                }
            }

        } else {
            for(int i=0;i<len-1;i++) {
                for(int j=i+1;j<len;j++) {
                    if (a[i] < a[j]) {
                        t=a[j];
                        a[j]=a[i];
                        a[i]=t;
                    }
                }
            }

        }
    }
        public static void main(String[] args) {
        int[] a={54,23,24,66,77,43,81,71,91,88};
        bubble_sort(a, true);
        printArray(a);
        bubble_sort(a, false);
        printArray(a);
    }
}
