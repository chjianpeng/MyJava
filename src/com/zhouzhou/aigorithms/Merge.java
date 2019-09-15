package com.zhouzhou.aigorithms;

/**
 * 自顶向下的归并排序
 * 分治思想
 */
public class Merge {
    private static Comparable[] aux;

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo){
            return;
        }
        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid);           //左半边排序
        sort(a, mid + 1, hi);   //右半边排序
        marge(a, lo, mid, hi);
    }

    //将 a[lo..mid] 和 a[mid+1..hi] 归并
    private static void marge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++){
            aux[k] = a[k];              //将a[lo..hi]复制到aux
        }
        for (int k = lo; k <= hi; k++){
            if (i > mid){
                a[k] = aux[j++];
            }else if (j > hi){
                a[k] = aux[i++];
            }else if (Example.less(aux[j], aux[i])){
                a[k] = aux[j++];
            }else {
                a[k] = aux[i++];
            }

        }
    }

    public static void main(String[] args) {
        String[] a = {"E", "E", "G", "M", "R", "A", "C", "E", "R", "T"};
        sort(a);
    }
}
