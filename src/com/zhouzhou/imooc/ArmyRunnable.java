package com.zhouzhou.imooc;

/**
 * 军队线程
 * 模拟作战双方的行为
 */
public class ArmyRunnable implements Runnable{
    //volatile保证了线程可以真确读取其他线程写入的值
    volatile boolean keepRun = true;
    @Override
    public void run() {
        while (keepRun){
            //发动五连击
            for (int i=0; i<5; i++){
                System.out.println(Thread.currentThread().getName() + "进攻对方【" +i+ "】次");
                //让出处理器时间，下次该谁进攻还不一定呢
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName() + "结束了战斗");
    }
}
