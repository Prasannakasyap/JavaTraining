package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInput {

    public void readFile() throws IOException {
        FileInputStream fin = new FileInputStream("C:/java_cgi/Day1/ExDemos/src/com/java/ex/Voting.java");
        int ch;
        while((ch=fin.read()) != -1) {
            System.out.print((char)ch);
        }
        fin.close();
    }
    public static void main(String[] args) {
        FInput obj = new FInput();
        try {
            obj.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
