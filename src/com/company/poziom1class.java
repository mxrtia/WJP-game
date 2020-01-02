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
    public static JButton klawiatura;
    public static JButton miniklawa;
    public static JButton start;
    public static JButton wroc;

    public poziom1class(GameWindow gw, JButton opcje) {
        g = gw;
        //w = new Window();
        this.poziom1 = Main.poziom1;
        this.poziom2 = Main.poziom2;
        this.poziom3 = Main.poziom3;
        this.poziom4 = Main.poziom4;
        this.opcje = Main.opcje;

        klawiatura = new JButton();
        miniklawa = new JButton();
        start = new JButton();
        wroc = new JButton();

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

        g.ButtonImage(key1, "images/key0t.png", 190, 285, false); //GOOD
        g.ButtonImage(key2, "images/key1t.png", 258, 285, false); //GOOD
        g.ButtonImage(key3, "images/key2t.png", 280,285, false); //GOOD
        g.ButtonImage(key4, "images/key1t.png", 347,285, false); //GOOD
        g.ButtonImage(key5, "images/key4t.png", 370,285, false); //GOOD
        g.ButtonImage(key6, "images/key0t.png", 461, 285, false); //GOOD
        g.ButtonImage(key7, "images/key1t.png", 527, 285, false); //GOOD
        g.ButtonImage(key8, "images/key2t.png", 551,285, false); //GOOD
        g.ButtonImage(key9, "images/key1t.png", 616,285, false); //GOOD
        g.ButtonImage(key10, "images/key2t.png", 640, 285, false); //GOOD
        g.ButtonImage(key11, "images/key1t.png", 707, 285, false); //GOOD
        g.ButtonImage(key12, "images/key4t.png", 729, 285, false); //GOOD
        g.ButtonImage(key13, "images/key0t.png", 819, 285, false); //GOOD
        g.ButtonImage(key14, "images/key1t.png", 885, 285, false); //GOOD
        g.ButtonImage(key15, "images/key2t.png", 909, 285, false); //GOOD
        g.ButtonImage(key16, "images/key1t.png", 976, 285, false); //GOOD
        g.ButtonImage(key17, "images/key4t.png", 999, 285, false); //GOOD

        key1.setVisible(false);
        key2.setVisible(false);
        key3.setVisible(false);
        key4.setVisible(false);
        key5.setVisible(false);
        key6.setVisible(false);
        key7.setVisible(false);
        key8.setVisible(false);
        key9.setVisible(false);
        key10.setVisible(false);
        key11.setVisible(false);
        key12.setVisible(false);
        key13.setVisible(false);
        key14.setVisible(false);
        key15.setVisible(false);
        key16.setVisible(false);
        key17.setVisible(false);
    }

    //co się stanie jak klikniesz poziom1???
    public void actionPerformed(ActionEvent e)
    {
        g.add(key1);
        g.add(key2);
        g.add(key3);
        g.add(key4);
        g.add(key5);
        g.add(key6);
        g.add(key7);
        g.add(key8);
        g.add(key9);
        g.add(key10);
        g.add(key11);
        g.add(key12);
        g.add(key13);
        g.add(key14);
        g.add(key15);
        g.add(key16);
        g.add(key17);


        g.add(klawiatura);
        g.add(miniklawa);
        g.add(start);
        g.add(wroc);
        g.ButtonImage(klawiatura, "images/piano_keys2.jpg", 190, 285, false);
        g.ButtonImage(miniklawa, "images/keys.png",190, 220, false);
        g.ButtonImage(start, "images/start.png", 432, 700, true);
        g.ButtonImage(wroc, "images/wroc.png", 800, 890, true);
        //poziom1.setVisible(false);
        poziom2.setVisible(false);
        poziom3.setVisible(false);
        poziom4.setVisible(false);
        opcje.setVisible(true);


        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());


    }




    public static class MyDispatcher implements KeyEventDispatcher {
        @Override
        public boolean dispatchKeyEvent(KeyEvent ke) {
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_Q) {
                PianoTime.wlaczDzwiek1();
                key1.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_Q){
                key1.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_2) {
                PianoTime.wlaczDzwiek2();
                key2.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_2){
                key2.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_W) {
                PianoTime.wlaczDzwiek3();
                key3.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_W){
                key3.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_3) {
                PianoTime.wlaczDzwiek4();
                key4.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_3){
                key4.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_E) {
                PianoTime.wlaczDzwiek5();
                key5.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_E){
                key5.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_R) {
                PianoTime.wlaczDzwiek6();
                key6.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_R){
                key6.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_5) {
                PianoTime.wlaczDzwiek7();
                key7.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_5){
                key7.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_T) {
                PianoTime.wlaczDzwiek8();
                key8.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_T){
                key8.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_6) {
                PianoTime.wlaczDzwiek9();
                key9.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_6){
                key9.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_Y) {
                PianoTime.wlaczDzwiek10();
                key10.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_Y){
                key10.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_7) {
                PianoTime.wlaczDzwiek11();
                key11.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_7){
                key11.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_U) {
                PianoTime.wlaczDzwiek12();
                key12.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_U){
                key12.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_I) {
                PianoTime.wlaczDzwiek13();
                key13.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_I){
                key13.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_9) {
                PianoTime.wlaczDzwiek14();
                key14.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_9){
                key14.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_O) {
                PianoTime.wlaczDzwiek15();
                key15.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_O){
                key15.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_0) {
                PianoTime.wlaczDzwiek16();
                key16.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_0){
                key16.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_P) {
                PianoTime.wlaczDzwiek17();
                key17.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_P){
                key17.setVisible(false);
            }
            return false;
        }

    }



}
