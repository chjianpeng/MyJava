package com.zhouzhou.aigorithms;

/**
 * 基于堆的优先队列
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N = 0;

    public MaxPQ(int maxN){
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    //插入元素
    public void insert(Key v){
        pq[++N] = v;
        swim(N);
    }

    //删除最大元素
    public Key delMax(){
        Key max = pq[1];
        exch(1, N--);
        pq[N+1] = null;
        sink(1);
        return max;
    }

    //堆实现的比较方法
    private boolean less(int i, int j){
        return pq[i].compareTo(pq[j]) < 0;
    }

    //交换
    private void exch(int i, int j){
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    //上浮
    private void swim(int k){
        while (k > 1 && less(k/2, k)){
            exch(k/2, k);
            k = k/2;
        }
    }

    //下沉
    private void sink(int k){
        while (2*k <= N){
            int j = 2*k;
            if (j < N && less(j, j+1)) j++;
            if (!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }


    public static void main(String[] args) {
        MaxPQ<Integer> maxPQ = new MaxPQ<Integer>(10);
        maxPQ.insert(7);
        maxPQ.insert(5);
        maxPQ.insert(9);
        maxPQ.insert(3);
        maxPQ.insert(1);
        maxPQ.insert(4);
        maxPQ.insert(10);

        maxPQ.delMax();
        maxPQ.delMax();
        maxPQ.insert(12);

        maxPQ.delMax();

        maxPQ.insert(2);
        maxPQ.insert(6);

        maxPQ.delMax();
        maxPQ.delMax();
    }
}
