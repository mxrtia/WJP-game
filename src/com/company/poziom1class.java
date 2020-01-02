package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.security.Key;

public class poziom1class implements ActionListener{

    public GameWindow g;
    public static GameWindow w;
    public JButton poziom1;
    public static JButton poziom2;
    public static JButton poziom3;
    public static JButton poziom4;
    public static JButton opcje;

    public static JButton key1;
    public static JButton key2;
    public static JButton key3;
    public static JButton key4;
    public static JButton key5;
    public static JButton key6;
    public static JButton key7;
    public static JButton key8;
    public static JButton key9;
    public static JButton key10;
    public static JButton key11;
    public static JButton key12;
    public static JButton key13;
    public static JButton key14;
    public static JButton key15;
    public static JButton key16;
    public static JButton key17;

    public poziom1class(GameWindow gw, JButton opcje) {
        g = gw;
        //w = new Window();
        this.poziom1 = Main.poziom1;
        this.poziom2 = Main.poziom2;
        this.poziom3 = Main.poziom3;
        this.poziom4 = Main.poziom4;
        this.opcje = Main.opcje;

        key1 = new JButton();
        key2 = new JButton();
        key3 = new JButton();
        key4 = new JButton();
        key5 = new JButton();
        key6 = new JButton();
        key7 = new JButton();
        key8 = new JButton();
        key9 = new JButton();
        key10 = new JButton();
        key11 = new JButton();
        key12 = new JButton();
        key13 = new JButton();
        key14 = new JButton();
        key15 = new JButton();
        key16 = new JButton();
        key17 = new JButton();

        //g.ButtonImage(key1, "images/key0.png", 190, 20, true);
        //g.ButtonImage(key2, "images/key1.png", 250, 20, true);
        /*g.ButtonImage(key3, "images/key2.png", 640,20,true);
        g.ButtonImage(key4, "images/key3.png", 959,20,true);
        g.ButtonImage(key5, "images/key4.png", 1045,20, true);*/

        /*g.add(key1);
        g.add(key2);

        key1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (key1.getModel().isPressed()) {
                    PianoTime.wlaczDzwiek1();
                }
            }
        });*/
    }


    //co się stanie jak klikniesz poziom1???
    public void actionPerformed(ActionEvent e)
    {
        JButton p = (JButton) e.getSource();

        g.ButtonImage(p, "images/piano_keys.png", 190, 285, false);
        //poziom1.setVisible(false);
        poziom2.setVisible(false);
        poziom3.setVisible(false);
        poziom4.setVisible(false);

        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
    }

    public static class MyDispatcher implements KeyEventDispatcher {
        @Override
        public boolean dispatchKeyEvent(KeyEvent ke) {
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_Q) {
                PianoTime.wlaczDzwiek1();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_2) {
                PianoTime.wlaczDzwiek2();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_W) {
                PianoTime.wlaczDzwiek3();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_3) {
                PianoTime.wlaczDzwiek4();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_E) {
                PianoTime.wlaczDzwiek5();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_R) {
                PianoTime.wlaczDzwiek6();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_5) {
                PianoTime.wlaczDzwiek7();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_T) {
                PianoTime.wlaczDzwiek8();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_6) {
                PianoTime.wlaczDzwiek9();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_Y) {
                PianoTime.wlaczDzwiek10();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_7) {
                PianoTime.wlaczDzwiek11();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_U) {
                PianoTime.wlaczDzwiek12();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_I) {
                PianoTime.wlaczDzwiek13();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_9) {
                PianoTime.wlaczDzwiek14();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_O) {
                PianoTime.wlaczDzwiek15();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_0) {
                PianoTime.wlaczDzwiek16();
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_P) {
                PianoTime.wlaczDzwiek17();
            }

            return false;
        }

    }



}
