package com.company;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Parameters {
    public static Image bgImage;

    public static void loadInitialImages() {
        bgImage = loadImage("images/background.png");
    }


    public static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }


}
