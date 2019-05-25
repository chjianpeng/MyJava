package com.myCompany.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;

public class BufferedInputFile2 {
    public static LinkedList read(String fileName) throws Exception {
        File file = new File(fileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s;
        LinkedList linkedList = new LinkedList();
        while ((s = bufferedReader.readLine()) != null){
            linkedList.add(s);
        }
        bufferedReader.close();

        return linkedList;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(read("/Volumes/SD/Code/test.txt"));
    }
}
