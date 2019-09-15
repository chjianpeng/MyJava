package com.zhouzhou.strategy;

/**
 * 什么都不做，不会叫
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
