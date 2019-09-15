package com.zhouzhou.strategy;

/**
 * 利用火箭动力的飞行行为
 */
public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm fly whit a rocket!");
    }
}
