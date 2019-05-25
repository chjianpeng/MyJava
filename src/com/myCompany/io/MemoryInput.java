package com.myCompany.io;

import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) throws Exception {
        String read = BufferedInputFile.read("/Volumes/SD/Code/test.txt");
        StringReader stringReader = new StringReader(read);
        int c;
        while ((c = stringReader.read()) != -1){
            System.out.println((char)c);
        }
        stringReader.close();
    }
}
