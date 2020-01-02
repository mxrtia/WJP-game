package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GameWindow extends JFrame {

    BufferedImage zdjecie;

    GameWindow(String nazwa, int width, int height, int xCenter, int yCenter)
    {
        super(nazwa); //utwórz okno

        int width2 = (int)width;
        int height2 = (int)height;
        setResizable(false);
        setSize(width2,height2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void ButtonImage(JButton b, String file, int layoutX, int layoutY, boolean border)
    {
        try
        {
            zdjecie = ImageIO.read(new File(file));
            int imagewidth = zdjecie.getWidth();
            int imageheight= zdjecie.getHeight();
            b.setSize(imagewidth,imageheight);
            b.setIcon(new ImageIcon(zdjecie));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        b.setOpaque(false);
        b.setBorderPainted(border);
        b.setContentAreaFilled(false);
        b.setLocation(new Point(layoutX,layoutY));
        b.setVisible(true);
    }

}
