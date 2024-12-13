package com.qascript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\tawsi\\FileInputStreamDemo.txt");
            //FileInputStream fis = new FileInputStream("C:\\Users\\tawsi");
            int c = fis.read();
            while (c!= -1) {
                System.out.print((char) c);
                c = fis.read();

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
