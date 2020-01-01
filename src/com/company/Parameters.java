package com.company;

import java.applet.AudioClip;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Parameters {
    public static Image bgImage;
    /** TYMCZASOWA KLAWIATURA **/
    public static Image klawiatura;



    public static void loadInitialImages() {
        bgImage = loadImage("images/background.png");

        klawiatura = loadImage("images/piano_keys.png");

    }

    //metoda pobierająca obiekt klasy Image na podstawie ścieżki dostępu podanej jako String
    public static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }
}
