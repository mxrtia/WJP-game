package com.company;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.io.*;
import javax.imageio.*;

public class Main {


	//public static JButton przejdzdooknagra;
	public static JButton poziom1;
	public static JButton poziom2;
	public static JButton poziom3;
	public static JButton poziom4;
	public static JButton opcje;

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
		System.out.println("błąd tła");
	}

		//przejdzdooknagra = new JButton();
    	poziom1 = new JButton();
    	poziom2 = new JButton();
    	poziom3 = new JButton();
    	poziom4 = new JButton();
    	opcje = new JButton();

		//przejdzdooknagra.addActionListener(new GamePanel(gra, przejdzdooknagra, poziom1, poziom2, poziom3, poziom4, opcje));
		poziom1.addActionListener(new poziom1class(gra, opcje));
		poziom2.addActionListener(new poziom2class(gra, opcje));
		poziom3.addActionListener(new poziom3class(gra, opcje));
		poziom4.addActionListener(new poziom4class(gra, opcje));
		//opcje.addActionListener(new GamePanel(gra, przejdzdooknagra, poziom1, poziom2, poziom3, poziom4, opcje));


		//gra.ButtonImage(przejdzdooknagra, "images/start.png", 100, 0, true);
		gra.ButtonImage(poziom1, "images/poziom1.png", 0,890, true);
        gra.ButtonImage(poziom2, "images/poziom2.png", 320,890, true);
        gra.ButtonImage(poziom3, "images/poziom3.png", 640,890, true);
        gra.ButtonImage(poziom4, "images/poziom4.png", 959,890, true);
        gra.ButtonImage(opcje, "images/opcje.png", 1045,800, true);


		//gra.add(przejdzdooknagra);
		gra.add(poziom1);
		gra.add(poziom2);
		gra.add(poziom3);
		gra.add(poziom4);
		gra.add(opcje);

    	gra.setVisible(true); //WYŚWIETLENIE LABELU Z TŁEM GŁÓWNYM

    }

}
