package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {

    public void fileCopy() throws IOException {
        FileInputStream src = new FileInputStream("C:/java_cgi/Day1/ExDemos/src/com/java/ex/Voting.java");
        FileOutputStream tar = new FileOutputStream("d:/files/Vote.java");
        int ch;
        while((ch=src.read()) != -1) {
            tar.write((char)ch);
        }
        src.close();
        tar.close();
        System.out.println("*** File Copied ***");
    }
    public static void main(String[] args) {
        FOutput obj = new FOutput();
        try {
            obj.fileCopy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
