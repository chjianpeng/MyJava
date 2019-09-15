package com.zhouzhou.strategy;

/**
 * 实现飞行行为
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
