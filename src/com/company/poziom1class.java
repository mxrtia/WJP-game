package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.security.Key;
import java.util.Map;
import java.util.TreeMap;

public class poziom1class implements ActionListener{

    public static Main main;
    public static GameWindow g;
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
    //public static JButton wroc;
    public static JButton klawiaturabezdzwiekow;
    public static JButton klawiaturazdzwiekami;
    public static JButton wyjscie;
    public static JTextArea informacja;
    public static JButton arrow;
    public static JTextArea koniec;

    /** POZIOM 1 **/
    public static int keyeventy[]={KeyEvent.VK_Y, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_W, KeyEvent.VK_R, KeyEvent.VK_Y,
            KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_E,
            KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_Y, KeyEvent.VK_R, KeyEvent.VK_W,
            KeyEvent.VK_T, KeyEvent.VK_7, KeyEvent.VK_O,
            KeyEvent.VK_I, KeyEvent.VK_7, KeyEvent.VK_Y,
            KeyEvent.VK_R, KeyEvent.VK_Y, KeyEvent.VK_T,
            KeyEvent.VK_R, KeyEvent.VK_E,
            KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T, KeyEvent.VK_Y,
            KeyEvent.VK_R, KeyEvent.VK_W, KeyEvent.VK_ENTER}; //36 elementów
    public static int XPos[]={396, 459, 564,
            459, 396, 296,
            296, 459, 653,
            564, 459, 396,
            396, 459, 564,
            653, 459, 296,
            564, 698, 925, 819, 698, 653,
            459, 653, 564, 459, 396,
            396, 459, 564, 653,
            459, 296, 396}; //37 elementów, 1 w poprzednim, (36 + 1 pusty)

    public static int counter = 0;
    public static int last = 36;

    /** POZIOM 2 **/

    public static int keyeventy2[]={KeyEvent.VK_E, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_E,
            KeyEvent.VK_E, KeyEvent.VK_W, KeyEvent.VK_W,
            KeyEvent.VK_E, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_E,
            KeyEvent.VK_W, KeyEvent.VK_Q, KeyEvent.VK_Q,
            KeyEvent.VK_W, KeyEvent.VK_W, KeyEvent.VK_E, KeyEvent.VK_Q,
            KeyEvent.VK_W, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_Q,
            KeyEvent.VK_W, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_W,
            KeyEvent.VK_E, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_E,
            KeyEvent.VK_W, KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_ENTER}; //63 elementy (62+jeden pusty)
    public static int XPos2[]={396, 459, 564,
            564, 459, 396, 296,
            190, 190, 296, 396,
            396, 296, 296,
            396, 396, 459, 564,
            564, 459, 396, 296,
            190, 190, 296, 396,
            296, 190, 190,
            296, 296, 396, 190,
            296, 396, 459, 396, 190,
            296, 396, 459, 396, 296,
            190, 296, 296,
            396, 396, 459, 564,
            564, 459, 396, 296,
            190, 190, 296, 396,
            296, 190, 190, 653}; //62 elementy (1 w mainie, 61+jeden do następnego)

    public static int counter2 = 0;
    public static int last2 = 62;

    /** POZIOM 3 **/


    public poziom1class(GameWindow gw) {
        g = gw;
        //w = new Window();
        this.poziom1 = Main.poziom1;
        this.poziom2 = Main.poziom2;
        this.poziom3 = Main.poziom3;
        this.poziom4 = Main.poziom4;
        this.opcje = Main.opcje;
        this.klawiatura = Main.klawiatura;
        this.miniklawa = Main.miniklawa;
        this.start = Main.start;
        this.key1 = Main.key1;
        this.key2 = Main.key2;
        this.key3 = Main.key3;
        this.key4 = Main.key4;
        this.key5 = Main.key5;
        this.key6 = Main.key6;
        this.key7 = Main.key7;
        this.key8 = Main.key8;
        this.key9 = Main.key9;
        this.key10 = Main.key10;
        this.key11 = Main.key11;
        this.key12 = Main.key12;
        this.key13 = Main.key13;
        this.key14 = Main.key14;
        this.key15 = Main.key15;
        this.key16 = Main.key16;
        this.key17 = Main.key17;
        this.klawiaturabezdzwiekow = Main.klawiaturabezdzwiekow;
        this.klawiaturazdzwiekami = Main.klawiaturazdzwiekami;
        this.wyjscie = Main.wyjscie;
        this.informacja = Main.informacja;
        this.arrow = Main.arrow;

        koniec = new JTextArea();
        koniec.setEditable(false);
        koniec.setText("Gratulacje! Udało ci się ukończyć poziom. \nTwój wynik: PTS \nTwój czas: s");
        Font czcionka = new Font ("Impact", Font.PLAIN, 40);
        koniec.setFont(czcionka);
        koniec.setForeground(Color.white);
        koniec.setBounds(100, 600, 1000, 500);
        koniec.setOpaque(false);
        koniec.setVisible(false);


        g.ButtonImage(arrow, "images/arrow.png", 653, 135, false);
    }

    //co się stanie jak klikniesz poziom1???
    public void actionPerformed(ActionEvent e)
    {
        g.add(klawiatura);
        g.add(arrow);
        g.add(koniec);


        klawiatura.setVisible(true);
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
        //poziom1.setVisible(false);
        poziom2.setVisible(false);
        poziom3.setVisible(false);
        poziom4.setVisible(false);
        opcje.setVisible(true);
        miniklawa.setVisible(true);
        start.setVisible(true);
        informacja.setVisible(false);

        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                start.setVisible(false);
                //restart.setVisible(true);
                //timer start
                arrow.setVisible(true);

            }
        });

    }


    public class MyDispatcher implements KeyEventDispatcher {




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


            if(poziom1.isVisible()) {
                if (counter != last) {
                    if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == keyeventy[counter]) {
                        arrow.setLocation(XPos[counter], 135);
                        counter++;
                        System.out.println(counter);
                        if (counter == 36) {
                            poziom1.setVisible(false);
                            miniklawa.setVisible(false);
                            klawiatura.setVisible(false);
                            koniec.setVisible(true);
                            poziom2.setVisible(true);
                            opcje.setVisible(false);
                            arrow.setVisible(false);
                        }
                    }
                }
            }
            if(poziom2.isVisible()) {
                if (counter2 != last2) {
                    if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == keyeventy2[counter2]) {
                        arrow.setLocation(XPos2[counter2], 135);
                        counter2++;
                        System.out.println(counter2);
                        if (counter2 == 62) {
                            poziom2.setVisible(false);
                            miniklawa.setVisible(false);
                            klawiatura.setVisible(false);
                            koniec.setVisible(true);
                            poziom3.setVisible(true);
                            opcje.setVisible(false);
                            arrow.setVisible(false);
                        }
                    }
                }
            }
            //System.out.println(keyeventy[counter]);
            return false;
        }
    }

}
