package com.zhouzhou.strategy;

/**
 * 测试类
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
       /* Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();*/

        Duck model = new ModelDack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
