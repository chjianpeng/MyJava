package com.zhouzhou.aigorithms;

/**
 * 希尔排序
 */
public class Shell {
    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while (h < N/3){
            h = 3 * h + 1;
        }
        while (h >= 1){
            for (int i = h; i < N; i++){
                for (int j = i; j >= h && Example.less(a[j], a[j-h]); j -= h){
                    Example.exch(a, j, j-h);
                }
            }
            h = h/5;
        }
    }

    /*private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }*/

    public static void main(String[] args) {
        String[] a = {"S", "H", "E", "L", "L", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        sort(a);
    }
}
