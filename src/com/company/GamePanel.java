package com.company;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import javax.swing.*;
import javax.sound.sampled.*;
import javax.swing.border.Border;

public class GamePanel extends JPanel {
    public int Width;
    public int Height;
    public int barHeight;
    public Font menuFont;
    public static JButton dzwiekiklawiatura;
    public static JButton blankklawiatura;
    public static JButton wyjscie;
    public GameLevel gLevel;  //obiekt reprezentujący status gry

    //KONSTRUKTOR
    //KLASY
    //POLA
    //GRAFICZNEGO
    //GRY


    public GamePanel(int width, int height) {
        super();

        gLevel = new GameLevel();
        gLevel.resetujparametry();
        menuFont=new Font("Tahoma",Font.PLAIN,30);

        this.Width=width;
        this.Height=height;
        barHeight=125;
        dzwiekiklawiatura = new JButton("Klawiatura z dźwiękami (domyślna)");
        blankklawiatura = new JButton("Klawiatura bez dźwięków");
        wyjscie = new JButton("Wyjście z gry");
        JPanel panel = new JPanel(new GridLayout(3,2));
        //JPanel panel1 = new JPanel();
        //panel1.setBackground(Color.red);
        //this.add(panel1, BorderLayout.CENTER);
        panel.setLocation(100, 100);
        panel.add(dzwiekiklawiatura);
        panel.add(blankklawiatura);
        panel.add(wyjscie);

        this.add(panel, BorderLayout.SOUTH); //WIDOCZNY PANEL
        panel.setVisible(false);

        setFocusable(true);
        requestFocus();
        wyjscie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        } );

        blankklawiatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getGraphics().drawImage(Parameters.klawiatura, 194, 305, null);
            }

        });
        dzwiekiklawiatura.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getGraphics().drawImage(Parameters.klawiatura2, 194, 305, null);
            }

        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent me){
                if(me.getX()>1050 && me.getX()<1280 && me.getY()>(Height-barHeight)){
                    if(panel.isVisible()){
                        panel.setVisible(false);
                    }
                    else{
                    panel.setVisible(true);
                    }
                }

                /** BIAŁE KLAWISZE **/
                if(me.getX()>195 && me.getX()<261 && me.getY()>305 && me.getY()<700){
                    PianoTime.wlaczDzwiek1();
                }
                if(me.getX()>308 && me.getX()<349 && me.getY()>305 && me.getY()<700){
                    PianoTime.wlaczDzwiek3();
                }

                /** CZARNE KLAWISZE **/
                if(me.getX()>262 && me.getX()<307 && me.getY()>305 && me.getY()<528){
                    PianoTime.wlaczDzwiek2();
                }

            }
        });
    }



    @Override
    public void paintComponent(Graphics gs) {
        Graphics2D g = (Graphics2D) gs;
        //LEPSZA JAKOŚĆ GRAFIKI (ANTYALIASING ETC.)
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Parameters.bgImage, 0, 0, null); //RYSOWANIE TŁA

        g.drawImage(Parameters.klawiatura2,194,305,null);


        g.drawImage(Parameters.miniklawa, 194, 240, null);
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
            g.drawString("POZIOM 1", 75, Height-70);
            g.drawString("POZIOM 2", 325, Height-70);
            g.drawString("POZIOM 3", 575, Height-70);
            g.drawString("POZIOM 4", 825, Height-70);
            g.drawString("OPCJE", 1075, Height-70);
        }
    }


}//koniec GamePanel


