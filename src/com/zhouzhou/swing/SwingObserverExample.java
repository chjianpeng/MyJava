package com.zhouzhou.swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    JFrame fame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        fame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        fame.getContentPane().add(BorderLayout.CENTER, button);
    }
}
