package com.company;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Parameters {
    public static Image bgImage;

    public static void loadInitialImages() {
        bgImage = loadImage("images/background.png");
    }
    /**  Zmienna stanu okreĹ›lajÄ…cam czy jest przerwa w grze   */
    public static boolean pause=false;
    /** Zmienna stanu okreĹ›lajÄ…ca czy wybrano menu*/
    public static boolean levelPause=false;

    public static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }


}
