package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class poziom3class implements ActionListener{

    public GameWindow g;
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
    public static JButton klawiaturabezdzwiekow;
    public static JButton klawiaturazdzwiekami;
    public static JButton wyjscie;
    public static JTextArea informacja;
    public static JTextArea koniec;
    public static JButton padlock;
    public static JButton padlock2;
    public static JButton padlock3;


    public poziom3class(GameWindow gw, JButton opcje)
    {

        g = gw;
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
        this.koniec = poziom1class.koniec;
        padlock = Main.padlock;
        padlock2 = Main.padlock2;
        padlock3 = Main.padlock3;

    }

    //co się stanie jak klikniesz poziom3???
    public void actionPerformed(ActionEvent e)
    {
        g.add(klawiatura);

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
        poziom1.setVisible(false);
        poziom2.setVisible(false);
        //poziom3.setVisible(false);
        padlock.setVisible(false);
        padlock2.setVisible(false);
        padlock3.setVisible(false);
        poziom3.setLocation(0, 924);
        poziom4.setVisible(false);
        opcje.setVisible(true);
        miniklawa.setVisible(true);
        start.setVisible(true);
        informacja.setVisible(true);
        informacja.setText("MELODIA: Jingle Bells");
        koniec.setVisible(false);

    }
}
