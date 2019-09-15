package com.zhouzhou.strategy;

/**
 * 实现鸭子呱呱叫
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
