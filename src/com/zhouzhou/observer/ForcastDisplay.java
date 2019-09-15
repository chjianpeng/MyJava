package com.zhouzhou.observer;

public class ForcastDisplay implements Observer, DisplayElement{
    public ForcastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("调用了天气预报报告板");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        display();
    }
}
