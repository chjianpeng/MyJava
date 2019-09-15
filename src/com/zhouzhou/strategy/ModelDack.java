package com.zhouzhou.strategy;

/**
 * 模型鸭
 */
public class ModelDack extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a model duac!");
    }

    public ModelDack(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
