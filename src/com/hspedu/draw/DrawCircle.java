package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

// MyPanel 看作一个滑板
// graphic 看作一个画笔
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint 方法被调用了");
//        g.drawOval(10, 10, 100, 100);
//
//        g.drawLine(0,0,100, 100);
//        g.drawRect(10, 10, 110, 110);
//        g.setColor(Color.CYAN);
//        g.fillRect(120, 120, 200, 200);
//        g.fillOval(220, 220, 300, 150);

//        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bg.png"));
//        g.drawImage(image, 10, 10, 100, 100, this);
//        g.setColor(Color.RED);
//        g.setFont(new Font("Monospace", Font.BOLD, 100));
//        g.drawString("Hello World!", 100, 300);


        g.setColor(Color.CYAN);
        g.fillRect(100, 10, 15, 80);
        g.setColor(Color.black);
        g.drawRect(100, 10, 15, 80);


        g.setColor(Color.CYAN);
        g.fillRect(160, 10, 15, 80);
        g.setColor(Color.black);
        g.drawRect(160, 10, 15, 80);


        g.setColor(Color.CYAN);
        g.fillRect(115, 20, 45, 60);
        g.setColor(Color.black);
        g.drawRect(115, 20, 45, 60);


        g.setColor(Color.CYAN);
        g.fillOval(115, 30, 45, 45);
        g.setColor(Color.black);
        g.drawOval(115, 30, 45, 45);


        g.setColor(Color.CYAN);
        g.fillRect(137, 10, 2, 45);
        g.setColor(Color.black);
        g.drawRect(137, 10, 2, 45);

    }
}