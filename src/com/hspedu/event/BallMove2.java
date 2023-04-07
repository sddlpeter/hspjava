package com.hspedu.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove2 extends JFrame {
    MyPanel2 mp;
    public static void main(String[] args) {
        new BallMove2();
        System.out.println("program finished...");
    }

    public BallMove2() {
        mp = new MyPanel2();
        this.add(mp);
        this.setSize(400, 300);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }
}

class MyPanel2 extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}