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
        initGUI(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //setUndecorated(false);
        //setLocation(x,y); //ustaw pozycję okna
        //initGUI(width, height); //wywołaj metodę budowy interfejsu




    }
    private void initGUI(int width, int height){
        setLayout(new GridLayout(1,1)); //ustaw rozkĹ‚ad
        //ustaw zasoby i parametry poczÄ…tkowe
        Parameters.loadInitialImages();
        Toolkit tk = Toolkit.getDefaultToolkit();
        //ustaw kursor myszki w ksztaĹ‚cie tarczy
        //Cursor tCursor = tk.createCustomCursor(Parameters.cursorImage, new Point(10,10), "Target Cursor");
        //setCursor(tCursor);
        //((Component)screen.getFullScreenWindow()).setCursor(tCursor);
        add(new GamePanel(width,height)); //dodaj panel gry zawierający grafikę
    }//koniec initGUI()
}
