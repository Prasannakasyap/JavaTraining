package com.java.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteEmploy {

    public static void main(String[] args)  {
        try {
            FileOutputStream fout = new FileOutputStream("d:/files/Employ.txt");
            ObjectOutputStream objout = new ObjectOutputStream(fout);
            Employ employ = new Employ(1, "Hemanth", 84823);
            objout.writeObject(employ);
            objout.close();
            fout.close();
            System.out.println("*** Employ Object Stored ***");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
