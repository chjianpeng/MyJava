package com.zhouzhou.aigorithms;

public class Data implements Comparable<Data>{

    @Override
    public int compareTo(Data o) {
        return 0;
    }

    public static void main(String[] args) {
        String s = "s";
        int i = 10;
        System.out.println(s.hashCode());
    }
}
