package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GameWindow extends JFrame {

    BufferedImage bimg;

    GameWindow(String nazwa, int width, int height, int xCenter, int yCenter)
    {
        super(nazwa); //utwórz okno

        int width2 = (int)width;
        int height2 = (int)height;
        setResizable(false);
        setSize(width2,height2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }





    public void ButtonImage(JButton b, String file, int layoutX, int layoutY, boolean ramka)
    {
        try
        {
            bimg = ImageIO.read(new File(file));
            int imagewidth = bimg.getWidth();
            int imageheight= bimg.getHeight();
            b.setSize(imagewidth,imageheight);
            b.setIcon(new ImageIcon(bimg));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(ramka);
        b.setLocation(new Point(layoutX,layoutY));
        b.setVisible(true);
    }

    public String GetFromFile(String file)
    {
        String fileAsString="";
        try
        {
            InputStream is = new FileInputStream(file);
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));
            String line = buf.readLine();
            StringBuilder sb = new StringBuilder();

            while (line != null) {
                sb.append(line).append("\n");
                line = buf.readLine();
            }
            fileAsString = sb.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return fileAsString;
    }






}
