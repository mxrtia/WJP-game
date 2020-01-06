package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	public static JButton pomoc;
	public static JButton opcje;
    public static JButton klawiatura;
    public static JButton miniklawa;
    public static JButton start;
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
    public static JButton padlock;
    public static JButton padlock2;
    public static JButton padlock3;

    public static void main(String[] args) {
	int gameWidth =  1280;
	int gameHeight = 1024;

    GameWindow gra=new GameWindow("PianoTime", gameWidth, gameHeight);

    try
	{
		gra.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("res/images/background.png"))))); //WYSWIETLENIE TLA
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
    	pomoc = new JButton();
        opcje = new JButton();
        klawiatura = new JButton();
        miniklawa = new JButton();
        start = new JButton();
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
        padlock = new JButton();
        padlock2 = new JButton();
        padlock3 = new JButton();

		poziom1.addActionListener(new poziom1class(gra)); //PRZEJŚCIE DO poziom1class PO WCISNIECIU NA BUTTON poziom1

		gra.ButtonImage(poziom1, "res/images/poziom1.png", 0,924, true);
        gra.ButtonImage(poziom2, "res/images/poziom2.png", 320,924, true);
        gra.ButtonImage(poziom3, "res/images/poziom3.png", 640,924, true);
        gra.ButtonImage(poziom4, "res/images/poziom4.png", 959,924, true);
        gra.ButtonImage(opcje, "res/images/opcje.png", 1066,974, true);
        gra.ButtonImage(klawiatura, "res/images/piano_keys2.jpg", 190, 275, false);
        gra.ButtonImage(miniklawa, "res/images/keys.png",190, 210, false);
        gra.ButtonImage(start, "res/images/start.png", 432, 700, true);
        gra.ButtonImage(klawiaturabezdzwiekow, "res/images/klawiaturabezdzwiekow.png", 802, 949, true);
        gra.ButtonImage(klawiaturazdzwiekami, "res/images/klawiaturazdzwiekami.png", 802, 874, true);
        gra.ButtonImage(wyjscie, "res/images/exit.png", 1235, 0, false);
        gra.ButtonImage(pomoc, "res/images/help.png", 0,0,false);
        gra.ButtonImage(key1, "res/images/key0t.png", 190, 275, false); //GOOD
        gra.ButtonImage(key2, "res/images/key1t.png", 258, 275, false); //GOOD
        gra.ButtonImage(key3, "res/images/key2t.png", 280,275, false); //GOOD
        gra.ButtonImage(key4, "res/images/key1t.png", 347,275, false); //GOOD
        gra.ButtonImage(key5, "res/images/key4t.png", 370,275, false); //GOOD
        gra.ButtonImage(key6, "res/images/key0t.png", 461, 275, false); //GOOD
        gra.ButtonImage(key7, "res/images/key1t.png", 527, 275, false); //GOOD
        gra.ButtonImage(key8, "res/images/key2t.png", 551,275, false); //GOOD
        gra.ButtonImage(key9, "res/images/key1t.png", 616,275, false); //GOOD
        gra.ButtonImage(key10, "res/images/key2t.png", 640, 275, false); //GOOD
        gra.ButtonImage(key11, "res/images/key1t.png", 707, 275, false); //GOOD
        gra.ButtonImage(key12, "res/images/key4t.png", 729, 275, false); //GOOD
        gra.ButtonImage(key13, "res/images/key0t.png", 819, 275, false); //GOOD
        gra.ButtonImage(key14, "res/images/key1t.png", 885, 275, false); //GOOD
        gra.ButtonImage(key15, "res/images/key2t.png", 909, 275, false); //GOOD
        gra.ButtonImage(key16, "res/images/key1t.png", 976, 275, false); //GOOD
        gra.ButtonImage(key17, "res/images/key4t.png", 999, 275, false); //GOOD
        gra.ButtonImage(padlock, "res/images/klodka.png", 450, 855, false);
        gra.ButtonImage(padlock2, "res/images/klodka.png", 760, 855, false);
        gra.ButtonImage(padlock3, "res/images/klodka.png", 1080, 855, false);


        informacja.setText("Witaj w grze PianoTime! \nGrając w PianoTime możesz ćwiczyć swoją zręczność, \nkoncentrację oraz nauczyć się podstaw gry na pianinie.\nAby zacząć, wybierz poziom i kliknij przycisk 'Rozpocznij grę'.    ");
        Font czcionka = new Font ("Impact", Font.PLAIN, 40);
        informacja.setFont(czcionka);
        informacja.setForeground(Color.white);
        informacja.setBounds(100, 600, 1000, 500);
        informacja.setOpaque(false);

        gra.add(padlock);
        gra.add(padlock2);
        gra.add(padlock3);
        gra.add(klawiaturazdzwiekami);
        gra.add(klawiaturabezdzwiekow);
        gra.add(wyjscie);
        gra.add(pomoc);
        gra.add(poziom1);
        gra.add(poziom2);
        gra.add(poziom3);
        gra.add(poziom4);
        gra.add(opcje);
        gra.add(klawiatura);
        gra.add(miniklawa);
        gra.add(start);
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
        pomoc.setVisible(true);
        wyjscie.setVisible(true);
        opcje.setVisible(false);
        klawiatura.setVisible(false);
        miniklawa.setVisible(false);
        start.setVisible(false);
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


    	gra.setVisible(true); //WYŚWIETLENIE LABELU Z TLEM GLOWNYM


        //Wyjście z gry po naciśnięciu na button wyjscie
        wyjscie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } );

        //Wyświetlenie MessageBoxu z pomocą
        pomoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Gra składa się z czterech poziomów. \n \nGracz zaczyna od poziomu 1 i dopiero wtedy ma dostęp do poziomu 2 itd. \nPo ukończeniu każdego poziomu gracz otrzymuje informację o tym, w jakim \nczasie ukończył dany poziom oraz ile punktów udało mu się zdobyć.  \n \nW opcjach gracz ma możliwość zmiany wyglądu klawiatury. \nAby wyjść z gry, należy wcisnąć przycisk w prawym górnym rogu ekranu.", "Pomoc ", JOptionPane.INFORMATION_MESSAGE);

            }
        } );

        //Wyświetlenie dostępnych opcji
        opcje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(klawiaturazdzwiekami.isVisible()){
                    klawiaturazdzwiekami.setVisible(false);
                    klawiaturabezdzwiekow.setVisible(false);
                }
                else{
                    klawiaturabezdzwiekow.setVisible(true);
                    klawiaturazdzwiekami.setVisible(true);
                }
            }

        });

        //wyświetlenie klawiatury z podpisanymi dźwiękami
        klawiaturazdzwiekami.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gra.ButtonImage(klawiatura, "res/images/piano_keys2.jpg", 190, 275, false);
            }

        });
        //wyświetlenie klawiatury bez podpisanych dźwięków
        klawiaturabezdzwiekow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                gra.ButtonImage(klawiatura, "res/images/piano_keys.png", 190, 275, false);
            }

        });
    }

}
