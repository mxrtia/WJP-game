package com.company;

import java.applet.AudioClip;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Parameters {
    public static Image bgImage;
    /**  Zmienna stanu okreĹ›lajÄ…cam czy jest przerwa w grze   */
    public static boolean pause=false;
    /** Zmienna stanu okreĹ›lajÄ…ca czy wybrano menu*/
    public static boolean levelPause=false;
    /** TABLICA KLAWISZY PIANINA **/
    public static Image[] keys;
    /** TYMCZASOWA KLAWIATURA **/
    public static Image klawiatura;
    /** DZWIEK **/
    public static int dzwiek;
    /** MAŁA KLAWIATURA Z PODPISANYMI DŹWIĘKAMI **/
    public static Image miniklawa;

    public static Image klawiatura2;


    public static void loadInitialImages() {
        bgImage = loadImage("images/background.png");

        klawiatura = loadImage("images/piano_keys.png");

        miniklawa = loadImage("images/keys.png");

        klawiatura2 = loadImage("images/piano_keys2.jpg");

        keys = new Image[17];
        keys[0] = loadImage("images/key0.png");
        keys[1] = loadImage("images/key1.png");
        keys[2] = loadImage("images/key2.png");
        keys[3] = loadImage("images/key3.png");
        keys[4] = loadImage("images/key4.png");
        keys[5] = loadImage("images/key5.png");
        keys[6] = loadImage("images/key6.png");
        keys[7] = loadImage("images/key7.png");
        keys[8] = loadImage("images/key8.png");
        keys[9] = loadImage("images/key9.png");
        keys[10] = loadImage("images/key10.png");
        keys[11] = loadImage("images/key11.png");
        keys[12] = loadImage("images/key12.png");
        keys[13] = loadImage("images/key13.png");
        keys[14] = loadImage("images/key14.png");
        keys[15] = loadImage("images/key15.png");
        keys[16] = loadImage("images/key16.png");
    }

    //metoda pobierająca obiekt klasy Image na podstawie ścieżki dostępu podanej jako String
    public static Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();

    }


}
