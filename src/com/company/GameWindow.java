package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GameWindow extends JFrame {

    public BufferedImage zdjecie;
    GameWindow(String nazwa, int width, int height)
    {
        super(nazwa); //utwórz okno

        setResizable(false);
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //zamknij proces po zamknięciu okna
        setUndecorated(true);

    }

    public void ButtonImage(JButton button, String file, int layoutX, int layoutY, boolean border)
    {

        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setLocation(new Point(layoutX,layoutY));
        button.setVisible(true);
        button.setBorderPainted(border);
        try
        {
            zdjecie = ImageIO.read(new File(file));
            int imagewidth = zdjecie.getWidth();
            int imageheight= zdjecie.getHeight();
            button.setSize(imagewidth,imageheight);
            button.setIcon(new ImageIcon(zdjecie));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

}
