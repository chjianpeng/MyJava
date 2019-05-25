package com.myCompany.demo;

public class VectorDemo {
    public static void main(String[] args) {
        double[] a = {3.0, 4.0};
        Vector vector = new Vector(a);
        System.out.println(vector.getCoords()[0]);

        a[0] = 0.0;
        System.out.println(vector.getCoords()[0]);

    }
}
