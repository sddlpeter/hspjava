package com.hspedu.tankgame5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class TankGame extends JFrame {
    MyPanel mp = null;
    public TankGame() throws HeadlessException {
        mp = new MyPanel();
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


    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }
}
