package com.hspedu.tankgame2;

import javax.swing.*;
import java.awt.*;

public class TankGame extends JFrame {
    MyPanel mp = null;
    public TankGame() throws HeadlessException {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }
}
