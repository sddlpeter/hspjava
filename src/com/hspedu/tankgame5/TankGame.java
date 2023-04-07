package com.hspedu.tankgame5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.Scanner;

public class TankGame extends JFrame {
    MyPanel mp = null;
    public TankGame() throws HeadlessException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入选择： 1-新游戏  2-继续上局");
        String s = scanner.next();
        mp = new MyPanel(s);
        new Thread(mp).start();
        this.add(mp);
        this.setSize(1400, 950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {
                    Recorder.keepRecord();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }


    public static void main(String[] args) throws IOException {
        TankGame tankGame = new TankGame();
    }
}
