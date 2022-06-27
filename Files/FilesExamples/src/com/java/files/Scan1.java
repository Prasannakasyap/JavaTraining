package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Scan1 {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:/java_cgi/Day1/ExDemos/src/com/java/ex/Voting.java");
            Scanner sc = new Scanner(fin);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            fin.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
