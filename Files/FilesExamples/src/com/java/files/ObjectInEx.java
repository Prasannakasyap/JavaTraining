package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInEx {

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("d:/files/dataout.txt");
            ObjectInputStream objin = new ObjectInputStream(fin);
            String str = (String)objin.readObject();
            Date dt = (Date)objin.readObject();
            System.out.println(str + dt);
            objin.close();
            fin.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
