package com.company;

import  java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class GamePanel extends JPanel {
    public int Width;
    public int Height;
    public int barHeight;

    public GameLevel gLevel;  //obiekt reprezentujący status gry

    //KONSTRUKTOR
    //KLASY
    //POLA
    //GRAFICZNEGO
    //GRY

    public GamePanel(int width, int height) {

        gLevel = new GameLevel();
        gLevel.reset();

        this.Width=width;
        this.Height=height;
        barHeight=50;




        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){

            }
                /*if(1>0){
                    Parameters.bgImage = Parameters.loadImage("images/background.png");
                    repaint();
                }
                if(me.getX()>(Width-150) && me.getY()>(Height-barHeight)){
                    //Parameters.pause=!Parameters.pause;
                    return;
                }
            }*/

        });
    }//koniec GamePanel()
    @Override
    protected void paintComponent(Graphics gs) {
        Graphics2D g = (Graphics2D) gs;
        //Ustaw tryb lepszej jakoĹ›ci grafiki (wygĹ‚adzanie/antyaliasing)
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Narysuj tĹ‚o
        g.drawImage(Parameters.bgImage, 0, 0, null);
    }


}//koniec GamePanel


