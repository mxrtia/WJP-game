package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class poziom1class implements ActionListener{

    public GameWindow g;
    public static GameWindow w;
    public static JButton poziom1;
    public static JButton poziom2;
    public static JButton poziom3;
    public static JButton poziom4;
    public static JButton opcje;
    public poziom1class(GameWindow gw, JButton opcje)
    {
        g = gw;
        //w = new Window();
        this.poziom1=Main.poziom1;
        this.poziom2=Main.poziom2;
        this.poziom3=Main.poziom3;
        this.poziom4=Main.poziom4;
        this.opcje=Main.opcje;

    }



    //co się stanie jak klikniesz poziom1???
    public void actionPerformed(ActionEvent e)
    {
        JButton p = (JButton) e.getSource();
        //Window w = new Window("okienko", 25, 25, 22, 65);

        g.ButtonImage(p, "images/piano_keys.png", 190, 285, false);
        //poziom1.setVisible(false);
        poziom2.setVisible(false);
        poziom3.setVisible(false);
        poziom4.setVisible(false);

        g.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_Q) {
                    PianoTime.wlaczDzwiek1();
                }
                if (ke.getKeyCode() == KeyEvent.VK_2) {
                    PianoTime.wlaczDzwiek2();
                }
                if (ke.getKeyCode() == KeyEvent.VK_W) {
                    PianoTime.wlaczDzwiek3();
                }
                if (ke.getKeyCode() == KeyEvent.VK_3) {
                    PianoTime.wlaczDzwiek4();
                }
                if (ke.getKeyCode() == KeyEvent.VK_E) {
                    PianoTime.wlaczDzwiek5();
                }
                if (ke.getKeyCode() == KeyEvent.VK_R) {
                    PianoTime.wlaczDzwiek6();
                }
                if (ke.getKeyCode() == KeyEvent.VK_5) {
                    PianoTime.wlaczDzwiek7();
                }
                if (ke.getKeyCode() == KeyEvent.VK_T) {
                    PianoTime.wlaczDzwiek8();
                }
                if (ke.getKeyCode() == KeyEvent.VK_6) {
                    PianoTime.wlaczDzwiek9();
                }
                if (ke.getKeyCode() == KeyEvent.VK_Y) {
                    PianoTime.wlaczDzwiek10();
                }
                if (ke.getKeyCode() == KeyEvent.VK_7) {
                    PianoTime.wlaczDzwiek11();
                }
                if (ke.getKeyCode() == KeyEvent.VK_U) {
                    PianoTime.wlaczDzwiek12();
                }
                if (ke.getKeyCode() == KeyEvent.VK_I) {
                    PianoTime.wlaczDzwiek13();
                }
                if (ke.getKeyCode() == KeyEvent.VK_9) {
                    PianoTime.wlaczDzwiek14();
                }
                if (ke.getKeyCode() == KeyEvent.VK_O) {
                    PianoTime.wlaczDzwiek15();
                }
                if (ke.getKeyCode() == KeyEvent.VK_0) {
                    PianoTime.wlaczDzwiek16();
                }
                if (ke.getKeyCode() == KeyEvent.VK_P) {
                    PianoTime.wlaczDzwiek17();
                }
            }
        });
        poziom1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_Q) {
                    PianoTime.wlaczDzwiek1();
                }
                if (ke.getKeyCode() == KeyEvent.VK_2) {
                    PianoTime.wlaczDzwiek2();
                }
                if (ke.getKeyCode() == KeyEvent.VK_W) {
                    PianoTime.wlaczDzwiek3();
                }
                if (ke.getKeyCode() == KeyEvent.VK_3) {
                    PianoTime.wlaczDzwiek4();
                }
                if (ke.getKeyCode() == KeyEvent.VK_E) {
                    PianoTime.wlaczDzwiek5();
                }
                if (ke.getKeyCode() == KeyEvent.VK_R) {
                    PianoTime.wlaczDzwiek6();
                }
                if (ke.getKeyCode() == KeyEvent.VK_5) {
                    PianoTime.wlaczDzwiek7();
                }
                if (ke.getKeyCode() == KeyEvent.VK_T) {
                    PianoTime.wlaczDzwiek8();
                }
                if (ke.getKeyCode() == KeyEvent.VK_6) {
                    PianoTime.wlaczDzwiek9();
                }
                if (ke.getKeyCode() == KeyEvent.VK_Y) {
                    PianoTime.wlaczDzwiek10();
                }
                if (ke.getKeyCode() == KeyEvent.VK_7) {
                    PianoTime.wlaczDzwiek11();
                }
                if (ke.getKeyCode() == KeyEvent.VK_U) {
                    PianoTime.wlaczDzwiek12();
                }
                if (ke.getKeyCode() == KeyEvent.VK_I) {
                    PianoTime.wlaczDzwiek13();
                }
                if (ke.getKeyCode() == KeyEvent.VK_9) {
                    PianoTime.wlaczDzwiek14();
                }
                if (ke.getKeyCode() == KeyEvent.VK_O) {
                    PianoTime.wlaczDzwiek15();
                }
                if (ke.getKeyCode() == KeyEvent.VK_0) {
                    PianoTime.wlaczDzwiek16();
                }
                if (ke.getKeyCode() == KeyEvent.VK_P) {
                    PianoTime.wlaczDzwiek17();
                }
            }
        });
        opcje.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_Q) {
                    PianoTime.wlaczDzwiek1();
                }
                if (ke.getKeyCode() == KeyEvent.VK_2) {
                    PianoTime.wlaczDzwiek2();
                }
                if (ke.getKeyCode() == KeyEvent.VK_W) {
                    PianoTime.wlaczDzwiek3();
                }
                if (ke.getKeyCode() == KeyEvent.VK_3) {
                    PianoTime.wlaczDzwiek4();
                }
                if (ke.getKeyCode() == KeyEvent.VK_E) {
                    PianoTime.wlaczDzwiek5();
                }
                if (ke.getKeyCode() == KeyEvent.VK_R) {
                    PianoTime.wlaczDzwiek6();
                }
                if (ke.getKeyCode() == KeyEvent.VK_5) {
                    PianoTime.wlaczDzwiek7();
                }
                if (ke.getKeyCode() == KeyEvent.VK_T) {
                    PianoTime.wlaczDzwiek8();
                }
                if (ke.getKeyCode() == KeyEvent.VK_6) {
                    PianoTime.wlaczDzwiek9();
                }
                if (ke.getKeyCode() == KeyEvent.VK_Y) {
                    PianoTime.wlaczDzwiek10();
                }
                if (ke.getKeyCode() == KeyEvent.VK_7) {
                    PianoTime.wlaczDzwiek11();
                }
                if (ke.getKeyCode() == KeyEvent.VK_U) {
                    PianoTime.wlaczDzwiek12();
                }
                if (ke.getKeyCode() == KeyEvent.VK_I) {
                    PianoTime.wlaczDzwiek13();
                }
                if (ke.getKeyCode() == KeyEvent.VK_9) {
                    PianoTime.wlaczDzwiek14();
                }
                if (ke.getKeyCode() == KeyEvent.VK_O) {
                    PianoTime.wlaczDzwiek15();
                }
                if (ke.getKeyCode() == KeyEvent.VK_0) {
                    PianoTime.wlaczDzwiek16();
                }
                if (ke.getKeyCode() == KeyEvent.VK_P) {
                    PianoTime.wlaczDzwiek17();
                }
            }
        });
    }
}
