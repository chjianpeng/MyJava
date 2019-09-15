package com.zhouzhou.aigorithms;

/**
 * 优先队列的工具类
 */
public class MQUtil {
    /**
     * 堆实现的比较方法
     */
    public static boolean less(Comparable[] pq, int i, int j){
        return pq[i].compareTo(pq[j]) < 0;
    }

    /**
     * 交换
     */
    public static void exch(Comparable[] pq, int i, int j){
        Comparable t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    /**
     * 上浮
     */
    public static void swim(Comparable[] pq, int k){
        while (k > 1 && less(pq, k/2, k)){
            exch(pq, k/2, k);
            k = k/2;
        }
    }

    /**
     * 下沉
     */
    public static void sink(Comparable[] pq, int k, int N){
        while (2*k <= N){
            int j = 2*k;
            if (j < N && less(pq, j, j+1)){
                j++;
            }
            if (!less(pq, k, j)){
                break;
            }
            exch(pq, k, j);
            k = j;
        }
    }
}
