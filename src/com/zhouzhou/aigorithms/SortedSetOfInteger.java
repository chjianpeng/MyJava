package com.zhouzhou.aigorithms;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet测试类
 */
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        SortedSet<Integer> integerSortedSet =new TreeSet<>();
        for (int i=0; i<1000; i++){
            integerSortedSet.add(random.nextInt(30));
        }
        System.out.println(integerSortedSet);

    }
}
