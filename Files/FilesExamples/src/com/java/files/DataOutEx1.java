package com.java.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx1 {

    public void writeInfo() throws IOException {
        FileOutputStream fout = new FileOutputStream("d:/files/dataout.txt");
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeInt(52);
        dout.writeUTF("Prasanna");
        dout.writeDouble(88423.544);
        dout.writeBoolean(true);
        dout.close();
        fout.close();
        System.out.println("Primitive Types are Stored...");
    }
    public static void main(String[] args) {
        DataOutEx1 obj = new DataOutEx1();
        try {
            obj.writeInfo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
