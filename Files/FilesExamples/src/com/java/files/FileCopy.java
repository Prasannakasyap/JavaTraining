package com.java.files;

import java.io.*;

public class FileCopy {

    public void copyFile() throws IOException {
        File src = new File("C:/java_cgi/Day1/ExDemos/src/com/java/ex/Voting.java");
        File tar = new File("d:/files/CgiVoting.java");
        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(tar);
        int ch;
        while((ch=fr.read()) != -1) {
            fw.write((char)ch);
        }
        fr.close();
        fw.close();
        System.out.println("*** File Copied ***");
    }
    public static void main(String[] args) {
        FileCopy f1 = new FileCopy();
        try {
            f1.copyFile();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
