package com.company;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Main {
	public static int gameWidth =  1280;
	public static int gameHeight = 1024;

	public static int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
	public static int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;

	public static int xCenter=(screenWidth-gameWidth)/2;
	public static int yCenter=(screenHeight-gameHeight)/2;

	public static void main(String[] args) {


	//pobierz rozmiar ekranu


	//wyśrodkowanie pola gry na ekranie


    GameWindow gra=new GameWindow(gameWidth, gameHeight, xCenter, yCenter);
    gra.setVisible(true); //WYŚWIETLENIE TŁA
	GamePanel gra1=new GamePanel(gameWidth, gameHeight);





    }
}
