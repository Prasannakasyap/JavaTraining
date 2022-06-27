package com.java.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx1 {

    public void readFileInfo() throws IOException {
        FileInputStream fin = new FileInputStream("d:/files/dataout.txt");
        DataInputStream din = new DataInputStream(fin);
        int x = din.readInt();
        String str = din.readUTF();
        double bas = din.readDouble();
        boolean flag = din.readBoolean();
        System.out.println("X value  " +x);
        System.out.println("Name   " +str);
        System.out.println("Basic   " +bas);
        System.out.println("Boolean Value   " +flag);
        din.close();
        fin.close();
    }
    public static void main(String[] args) {
        DataInEx1 obj = new DataInEx1();
        try {
            obj.readFileInfo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
