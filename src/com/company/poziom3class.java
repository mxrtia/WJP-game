package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class poziom3class implements ActionListener{

    public GameWindow g;
    public static GameWindow w;
    public static JButton poziom1;
    public static JButton poziom2;
    public static JButton poziom3;
    public static JButton poziom4;
    public poziom3class(GameWindow gw, JButton opcje)
    {

    g = gw;
    //w = new Window();
        this.poziom1=Main.poziom1;
        this.poziom2=Main.poziom2;
        this.poziom3=Main.poziom3;
        this.poziom4=Main.poziom4;

        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new poziom1class.MyDispatcher());

}

    //co się stanie jak klikniesz poziom3???
    public void actionPerformed(ActionEvent e)
    {
        JButton p = (JButton) e.getSource();
        //Window w = new Window("okienko", 25, 25, 22, 65);

        g.ButtonImage(p, "images/piano_keys.png", 190, 285, false);
        poziom1.setVisible(false);
        poziom2.setVisible(false);
        //poziom3.setVisible(false);
        poziom4.setVisible(false);
    }
}
