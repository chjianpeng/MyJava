package com.zhouzhou.array;

/**
 * 封装Array
 */
public class Array {
    private int[] data;
    private int size;
    /**
     * 构造函数
     * @param capacity 数组的容量
     */
    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }
    public Array(){
        this(10);
    }

    //获取数组的元素个数
    public int getSize(){
        return size;
    }

    //获取数组的容量
    public int getCapacity(){
        return data.length;
    }

    //数组是否为空
    public boolean ieEmpty(){
        return size == 0;
    }

    //在最后添加元素
    public void  addLast(int e){
        /*if (size == data.length){
            throw new IllegalArgumentException("add last error，Array is full");
        }
        data[size] = e;
        size++;*/
        add(size, e);
    }

    public void addFirst(int e){
        add(0, e);
    }

    //在制定位置添加元素,在index的位置插入新元素e
    public void add(int index, int e){
        if (size == data.length){
            throw new IllegalArgumentException("add error，Array is full");
        }
        if (index < 0 || index > size){
            throw new IllegalArgumentException("add error，index >= 0 and index <= size");
        }
        for (int i = size-1; i >= index; i --){
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }





}
