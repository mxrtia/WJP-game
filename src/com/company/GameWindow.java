package com.company;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow(int width, int height, int x, int y)
    {
        super(); //utwórz okno
        setSize(width, height); //ustaw wymiary okna
        setResizable(false);
        setVisible(true);
        initGUI(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_Q) {
                    PianoTime.wlaczDzwiek1();
                }
                if (ke.getKeyCode() == KeyEvent.VK_2) {
                    PianoTime.wlaczDzwiek2();
                }
                if (ke.getKeyCode() == KeyEvent.VK_W) {
                    PianoTime.wlaczDzwiek3();
                }
                if (ke.getKeyCode() == KeyEvent.VK_3) {
                    PianoTime.wlaczDzwiek4();
                }
                if (ke.getKeyCode() == KeyEvent.VK_E) {
                    PianoTime.wlaczDzwiek5();
                }
                if (ke.getKeyCode() == KeyEvent.VK_R) {
                    PianoTime.wlaczDzwiek6();
                }
                if (ke.getKeyCode() == KeyEvent.VK_5) {
                    PianoTime.wlaczDzwiek7();
                }
                if (ke.getKeyCode() == KeyEvent.VK_T) {
                    PianoTime.wlaczDzwiek8();
                }
                if (ke.getKeyCode() == KeyEvent.VK_6) {
                    PianoTime.wlaczDzwiek9();
                }
                if (ke.getKeyCode() == KeyEvent.VK_Y) {
                    PianoTime.wlaczDzwiek10();
                }
                if (ke.getKeyCode() == KeyEvent.VK_7) {
                    PianoTime.wlaczDzwiek11();
                }
                if (ke.getKeyCode() == KeyEvent.VK_U) {
                    PianoTime.wlaczDzwiek12();
                }
                if (ke.getKeyCode() == KeyEvent.VK_I) {
                    PianoTime.wlaczDzwiek13();
                }
                if (ke.getKeyCode() == KeyEvent.VK_9) {
                    PianoTime.wlaczDzwiek14();
                }
                if (ke.getKeyCode() == KeyEvent.VK_O) {
                    PianoTime.wlaczDzwiek15();
                }
                if (ke.getKeyCode() == KeyEvent.VK_0) {
                    PianoTime.wlaczDzwiek16();
                }
                if (ke.getKeyCode() == KeyEvent.VK_P) {
                    PianoTime.wlaczDzwiek17();
                }
            }
        });

        //setUndecorated(false);
        //setLocation(x,y); //ustaw pozycję okna

    }
    private void initGUI(int width, int height){
        setLayout(new GridLayout(1,1)); //ustaw rozkład
        //ustaw zasoby i parametry początkowe
        Parameters.loadInitialImages();
        Toolkit tk = Toolkit.getDefaultToolkit();
        add(new GamePanel(width,height)); //dodaj panel gry zawierający grafikę
    }//koniec initGUI()
}
