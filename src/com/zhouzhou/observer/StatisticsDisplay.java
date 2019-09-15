package com.zhouzhou.observer;

public class StatisticsDisplay implements Observer, DisplayElement{

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("调用了统计布告板");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }
}
