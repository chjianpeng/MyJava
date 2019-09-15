package com.myCompany.thread;

public class Actor extends Thread {
    public void run(){
        System.out.println(getName() + "是一个演员");
        int count = 0;
        boolean keepRun = true;
        while (keepRun){
            System.out.println(getName() + "登台演出了"+ (++count) + "次");
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

        System.out.println(getName() + "演出结束了");
    }

    public static void main(String[] args) {
        Thread actor  = new Actor();
        actor.setName("Mr.Thread");
        actor.start();

        Thread actress = new Thread(new Actress(),"Ms.Runnable");
        actress.start();
    }
}