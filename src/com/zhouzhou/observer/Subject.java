package com.zhouzhou.observer;

/**
 * 观察着模式
 * 主题
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
