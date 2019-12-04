package com.company;
import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	int gameWidth =  1280;
	int gameHeight = 1024;

	//pobierz rozmiar ekranu
	int screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
	int screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;

	//wyśrodkowanie pola gry na ekranie
	int xCenter=(screenWidth-gameWidth)/2;
	int yCenter=(screenHeight-gameHeight)/2;

    GameWindow gra=new GameWindow(gameWidth, gameHeight, xCenter, yCenter);



	gra.setVisible(true);

    }
}
