package com.company;

import  java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class GamePanel extends JPanel {
    public int Width;
    public int Height;
    public int barHeight;
    public Font menuFont;

    public GameLevel gLevel;  //obiekt reprezentujący status gry

    //KONSTRUKTOR
    //KLASY
    //POLA
    //GRAFICZNEGO
    //GRY

    public GamePanel(int width, int height) {

        gLevel = new GameLevel();
        gLevel.reset();
        menuFont=new Font("Dialog",Font.BOLD,36);

        this.Width=width;
        this.Height=height;
        barHeight=125;


        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                if(me.getX()>1050 && me.getX()<1280 && me.getY()>(Height-barHeight)){
                    System.exit(1);
                }
            }

        });
    }//koniec GamePanel()
    @Override
    protected void paintComponent(Graphics gs) {
        Graphics2D g = (Graphics2D) gs;
        //LEPSZA JAKOŚĆ GRAFIKI (ANTYALIASING ETC.)
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Parameters.bgImage, 0, 0, null); //RYSOWANIE TŁA

        //NARYSOWANIE TYMCZASOWEJ KLAWIATURY
        //g.drawImage(Parameters.klawiatura,194,305,null);
        g.drawImage(Parameters.keys[0],198,305,null);
        g.drawImage(Parameters.keys[1], 264, 305, null);
        g.drawImage(Parameters.keys[2], 287, 304, null);
        g.drawImage(Parameters.keys[3], 352, 305, null);
        g.drawImage(Parameters.keys[4], 375, 304, null);
        g.drawImage(Parameters.keys[5], 464, 305, null);
        g.drawImage(Parameters.keys[6], 531, 305, null);
        g.drawImage(Parameters.keys[7], 553, 304, null);
        g.drawImage(Parameters.keys[8], 620, 305, null);
        g.drawImage(Parameters.keys[9], 643, 304, null);
        g.drawImage(Parameters.keys[10], 709, 304, null);
        g.drawImage(Parameters.keys[11], 731, 304, null);
        g.drawImage(Parameters.keys[12], 821, 305, null);
        g.drawImage(Parameters.keys[13], 888, 305, null);
        g.drawImage(Parameters.keys[14], 910, 304, null);
        g.drawImage(Parameters.keys[15], 977, 305, null);
        g.drawImage(Parameters.keys[16], 998, 304, null);


        //Ustaw kolor dolnego paska Menu i narysuj pasek
        g.setColor(Color.darkGray);
        g.fillRect(0, Height-barHeight, Width, barHeight);
        g.setFont(menuFont);


        if(Parameters.pause){
            g.setColor(Color.white);
            g.drawString("Wybrany poziom: ", 100, Height-70);
        }
        else{
            g.setColor(Color.white);
            g.drawString("Poziom 1", 75, Height-70);
            g.drawString("Poziom 2", 325, Height-70);
            g.drawString("Poziom 3", 575, Height-70);
            g.drawString("Poziom 4", 825, Height-70);
            g.drawString("Wyjście", 1075, Height-70);

        }
    }


}//koniec GamePanel


