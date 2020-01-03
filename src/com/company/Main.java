package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class Main {

	public static JButton poziom1;
	public static JButton poziom2;
	public static JButton poziom3;
	public static JButton poziom4;
	public static JButton klawiaturabezdzwiekow;
	public static JButton klawiaturazdzwiekami;
	public static JButton wyjscie;
	public static JButton opcje;
    public static JButton klawiatura;
    public static JButton miniklawa;
    public static JButton start;
    public static JButton wroc;
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
    public static JTextArea informacja;
    public static JButton arrow;

    public static void main(String[] args) {
	int gameWidth =  1280;
	int gameHeight = 1024;

	//pobierz rozmiar ekranu
	int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
	int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;

	//wyśrodkowanie pola gry na ekranie
	int xCenter=(screenWidth-gameWidth)/2;
	int yCenter=(screenHeight-gameHeight)/2;

    GameWindow gra=new GameWindow("PianoTime", gameWidth, gameHeight, xCenter, yCenter);

    try
	{
		gra.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("images/background.png")))));
	}
    catch(Exception ex)
	{

	}
		//przejdzdooknagra = new JButton();
    	poziom1 = new JButton();
    	poziom2 = new JButton();
    	poziom3 = new JButton();
    	poziom4 = new JButton();
        klawiaturazdzwiekami = new JButton();
        klawiaturabezdzwiekow = new JButton();
    	wyjscie = new JButton();
        opcje = new JButton();
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
        informacja = new JTextArea();
        informacja.setEditable(false);
        arrow = new JButton();

		poziom1.addActionListener(new poziom1class(gra));
		poziom2.addActionListener(new poziom2class(gra, opcje));
		poziom3.addActionListener(new poziom3class(gra, opcje));
		poziom4.addActionListener(new poziom4class(gra, opcje));

		gra.ButtonImage(poziom1, "images/poziom1.png", 0,890, true);
        gra.ButtonImage(poziom2, "images/poziom2.png", 320,890, true);
        gra.ButtonImage(poziom3, "images/poziom3.png", 640,890, true);
        gra.ButtonImage(poziom4, "images/poziom4.png", 959,890, true);
        gra.ButtonImage(opcje, "images/opcje.png", 1060,890, true);
        gra.ButtonImage(klawiatura, "images/piano_keys2.jpg", 190, 275, false);
        gra.ButtonImage(miniklawa, "images/keys.png",190, 210, false);
        gra.ButtonImage(start, "images/start.png", 432, 700, true);
        gra.ButtonImage(wroc, "images/wroc.png", 1060, 939, true);
        gra.ButtonImage(klawiaturabezdzwiekow, "images/klawiaturabezdzwiekow.png", 1008, 814, true);
        gra.ButtonImage(klawiaturazdzwiekami, "images/klawiaturazdzwiekami.png", 1008, 745, true);
        gra.ButtonImage(wyjscie, "images/wyjscie.png", 1008, 676, true);
        gra.ButtonImage(key1, "images/key0t.png", 190, 275, false); //GOOD
        gra.ButtonImage(key2, "images/key1t.png", 258, 275, false); //GOOD
        gra.ButtonImage(key3, "images/key2t.png", 280,275, false); //GOOD
        gra.ButtonImage(key4, "images/key1t.png", 347,275, false); //GOOD
        gra.ButtonImage(key5, "images/key4t.png", 370,275, false); //GOOD
        gra.ButtonImage(key6, "images/key0t.png", 461, 275, false); //GOOD
        gra.ButtonImage(key7, "images/key1t.png", 527, 275, false); //GOOD
        gra.ButtonImage(key8, "images/key2t.png", 551,275, false); //GOOD
        gra.ButtonImage(key9, "images/key1t.png", 616,275, false); //GOOD
        gra.ButtonImage(key10, "images/key2t.png", 640, 275, false); //GOOD
        gra.ButtonImage(key11, "images/key1t.png", 707, 275, false); //GOOD
        gra.ButtonImage(key12, "images/key4t.png", 729, 275, false); //GOOD
        gra.ButtonImage(key13, "images/key0t.png", 819, 275, false); //GOOD
        gra.ButtonImage(key14, "images/key1t.png", 885, 275, false); //GOOD
        gra.ButtonImage(key15, "images/key2t.png", 909, 275, false); //GOOD
        gra.ButtonImage(key16, "images/key1t.png", 976, 275, false); //GOOD
        gra.ButtonImage(key17, "images/key4t.png", 999, 275, false); //GOOD
        informacja.setText("Witaj w grze PianoTime! \nGrając w PianoTime możesz ćwiczyć swoją zręczność, \nkoncentrację oraz nauczyć się podstaw gry na pianinie.\nAby zacząć, wybierz poziom i kliknij przycisk 'Rozpocznij grę'.    ");
        Font czcionka = new Font ("Impact", Font.PLAIN, 40);
        informacja.setFont(czcionka);
        informacja.setForeground(Color.white);
        informacja.setBounds(100, 600, 1000, 500);
        informacja.setOpaque(false);

        gra.add(klawiaturazdzwiekami);
        gra.add(klawiaturabezdzwiekow);
        gra.add(wyjscie);
        gra.add(poziom1);
        gra.add(poziom2);
        gra.add(poziom3);
        gra.add(poziom4);
        gra.add(opcje);
        gra.add(klawiatura);
        gra.add(miniklawa);
        gra.add(start);
        gra.add(wroc);
        gra.add(key1);
        gra.add(key2);
        gra.add(key3);
        gra.add(key4);
        gra.add(key5);
        gra.add(key6);
        gra.add(key7);
        gra.add(key8);
        gra.add(key9);
        gra.add(key10);
        gra.add(key11);
        gra.add(key12);
        gra.add(key13);
        gra.add(key14);
        gra.add(key15);
        gra.add(key16);
        gra.add(key17);
        gra.add(informacja);
        gra.add(arrow);

        klawiaturazdzwiekami.setVisible(false);
        klawiaturabezdzwiekow.setVisible(false);
        wyjscie.setVisible(false);
        opcje.setVisible(false);
        klawiatura.setVisible(false);
        miniklawa.setVisible(false);
        start.setVisible(false);
        wroc.setVisible(false);
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
        informacja.setVisible(true);
        arrow.setVisible(false);

    	gra.setVisible(true); //WYŚWIETLENIE LABELU Z TŁEM GŁÓWNYM

        wyjscie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } );

        wyjscie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } );

        opcje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(klawiaturazdzwiekami.isVisible()){
                    klawiaturazdzwiekami.setVisible(false);
                    klawiaturabezdzwiekow.setVisible(false);
                    wyjscie.setVisible(false);
                }
                else{
                    klawiaturabezdzwiekow.setVisible(true);
                    klawiaturazdzwiekami.setVisible(true);
                    wyjscie.setVisible(true);
                }
            }

        });

        klawiaturazdzwiekami.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gra.ButtonImage(klawiatura, "images/piano_keys2.jpg", 190, 275, false);
            }

        });

        klawiaturabezdzwiekow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gra.ButtonImage(klawiatura, "images/piano_keys.png", 190, 275, false);
            }

        });
    }

}
