package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {

    public void readFile() throws IOException {
        File f1 = new File("C:/java_cgi/Day1/ExDemos/src/com/java/ex/Voting.java");
        FileReader fr = new FileReader(f1);
        int ch;
        while((ch=fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();
    }
    public static void main(String[] args) {
        FileReadEx obj = new FileReadEx();
        try {
            obj.readFile();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
