package com.company;
import java.awt.*;
import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow(int width, int height, int x, int y)
    {
        super(); //utwórz okno
        setSize(width, height); //ustaw wymiary okna
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Image background = Toolkit.getDefaultToolkit().createImage("Background.png");

        //setUndecorated(false);
        //setLocation(x,y); //ustaw pozycję okna
        //initGUI(width, height); //wywołaj metodę budowy interfejsu



    }
}
