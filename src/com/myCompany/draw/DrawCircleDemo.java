package com.myCompany.draw;

import sun.jvm.hotspot.utilities.Interval;

public class DrawCircleDemo {

    public static void main(String[] args) {
        double xlo = Double.parseDouble(args[0]);
        double xhi = Double.parseDouble(args[1]);
        double ylo = Double.parseDouble(args[3]);
        double yhi = Double.parseDouble(args[4]);
        Interval xinterval = new Interval(xlo,xhi);
        Interval yinterval = new Interval(yhi,ylo);

        Interval box = new Interval(xinterval,yinterval);



    }
}
