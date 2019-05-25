package com.myCompany.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedInputFile {
    public static String read(String fileName) throws Exception {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s;
        //StringBuilder sb =new StringBuilder();
        StringBuffer sb = new StringBuffer();
        while ((s = bufferedReader.readLine()) != null){
            sb.append(s + "\n");
        }
        bufferedReader.close();

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(read("/Volumes/SD/Code/test.txt"));
    }
}
