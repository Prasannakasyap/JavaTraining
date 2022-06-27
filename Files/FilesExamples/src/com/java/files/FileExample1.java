package com.java.files;

import java.io.File;

public class FileExample1 {
    public static void main(String[] args) {
        File f1 = new File("C:/java_cgi/Day1/ExDemos/src/com/java/ex/Voting.java");
        System.out.println("File Name   " +f1.getName());
        System.out.println("Full Name   " +f1.getPath());
        System.out.println("Parent Directory   " +f1.getParent());
    }
}
