package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuglowne implements ActionListener {

    public GameWindow g;
    public static JButton poziom1;
    public static JButton poziom2;
    public static JButton poziom3;
    public static JButton poziom4;
    public static JButton opcje;
    public static JButton klawiatura;
    public static JButton miniklawa;
    public static JButton start;
    public static JButton wroc;
    public static JButton klawiaturabezdzwiekow;
    public static JButton klawiaturazdzwiekami;
    public static JButton wyjscie;
    public static JTextArea informacja;
    public static JButton arrow;
    public static JTextArea koniec;

    public menuglowne(GameWindow gw){
        g = gw;

        poziom1 = Main.poziom1;
        poziom2 = Main.poziom2;
        poziom3 = Main.poziom3;
        poziom4 = Main.poziom4;
        opcje = Main.opcje;
        klawiatura = Main.klawiatura;
        miniklawa = Main.miniklawa;
        start = Main.start;
        wroc = Main.wroc;
        klawiaturabezdzwiekow = Main.klawiaturabezdzwiekow;
        klawiaturazdzwiekami = Main.klawiaturazdzwiekami;
        wyjscie = Main.wyjscie;
        informacja = Main.informacja;
        arrow = Main.arrow;
        koniec = poziom1class.koniec;
    }

    public void actionPerformed(ActionEvent e)
    {
        klawiaturazdzwiekami.setVisible(false);
        klawiaturabezdzwiekow.setVisible(false);
        wyjscie.setVisible(false);
        opcje.setVisible(false);
        miniklawa.setVisible(false);
        klawiatura.setVisible(false);
        start.setVisible(false);
        wroc.setVisible(false);
        koniec.setVisible(false);

        poziom1.setVisible(true);
        poziom2.setVisible(true);
        poziom2.setLocation(320, 890);
        poziom3.setVisible(true);
        poziom3.setLocation(640, 890);
        poziom4.setVisible(true);
        poziom4.setLocation(959, 890);
        informacja.setVisible(true);
        arrow.setVisible(false);
    }
}
