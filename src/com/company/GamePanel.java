package com.company;

import  java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel {
    public int Width;
    public int Height;
    public int barHeight;

    public GamePanel(int width, int height) {

        this.Width=width;
        this.Height=height;
        barHeight=50;
    }
}
