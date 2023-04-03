package com.hspedu.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    MyPanel mp;
    public static void main(String[] args) {
        new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400, 300);

        // JFrame窗口对象可以监听键盘事件，可以监听到面板发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}


// KeyListener 是监听器，可以监听键盘的事件
class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    int speed = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 20, 20);
    }


    // 监听字符输入
    @Override
    public void keyTyped(KeyEvent e) {

    }

    // 监听键盘按键
    @Override
    public void keyPressed(KeyEvent e) {
        // System.out.println(e.getKeyChar() + " 被按下");
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            y += speed;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            y -= speed;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= speed;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += speed;
        }

        this.repaint();
    }

    // 监听键盘按键释放
    @Override
    public void keyReleased(KeyEvent e) {

    }
}