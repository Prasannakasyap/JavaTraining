package com.java.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Custom {

    public static void main(String[] args) {
        String name;
        System.out.println("Enter Your Name   ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            name = br.readLine();
            System.out.println("Name is   " +name);
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
