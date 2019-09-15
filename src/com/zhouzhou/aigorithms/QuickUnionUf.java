package com.zhouzhou.aigorithms;

/**
 * 快速合并算法，查并集的数据结构
 */
public class QuickUnionUf {

    private int[] id;
    public QuickUnionUf(int N){
        id = new int[N];
        for(int j = 0 ; j < N ; j ++){        //N array accesses
            id[j] = j;
        }
    }

    private int root(int p){                  //depth of p array accesses
        while(id[p] != p){
            p = id[p];
        }
        return p;
    }

    public boolean connected(int p , int q){
        return root(id[p]) == root(id[q]);          //depth of p and q array accesses
    }

    public void union(int p , int q){              //depth of p and q array accesses
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}
