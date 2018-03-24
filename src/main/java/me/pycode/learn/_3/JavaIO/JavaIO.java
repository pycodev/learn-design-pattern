package me.pycode.learn._3.JavaIO;

import java.io.*;

public class JavaIO {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/java/me/pycode/learn/_3/JavaIO/test.txt")));
            while ((c = in.read()) > 0) {
                System.out.print((char)c);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
