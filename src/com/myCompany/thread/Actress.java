package com.myCompany.thread;

public class Actress implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "是一个演员");
        int count = 0;
        boolean keepRun = true;
        while (keepRun){
            System.out.println(Thread.currentThread().getName() + "登台演出了"+ (++count) + "次");
            if (count == 100){
                keepRun = false;
            }
            if (count % 10 == 0){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(Thread.currentThread().getName() + "演出结束了");
    }
}
