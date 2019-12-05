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


