package com.company;

import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;

public class PianoTime {

    public static void wlaczDzwiek1(){
        playSound(new File("sounds/c.wav"));
    }
    public static void wlaczDzwiek2(){
        playSound(new File("sounds/cis.wav"));
    }
    public static void wlaczDzwiek3(){
        playSound(new File("sounds/d.wav"));
    }
    public static void wlaczDzwiek4(){
        playSound(new File("sounds/dis.wav"));
    }
    public static void wlaczDzwiek5(){
        playSound(new File("sounds/e.wav"));
    }
    public static void wlaczDzwiek6(){
        playSound(new File("sounds/f.wav"));
    }
    public static void wlaczDzwiek7(){
        playSound(new File("sounds/fis.wav"));
    }
    public static void wlaczDzwiek8(){
        playSound(new File("sounds/g.wav"));
    }
    public static void wlaczDzwiek9(){
        playSound(new File("sounds/gis.wav"));
    }
    public static void wlaczDzwiek10(){
        playSound(new File("sounds/a.wav"));
    }
    public static void wlaczDzwiek11(){
        playSound(new File("sounds/ais.wav"));
    }
    public static void wlaczDzwiek12(){
        playSound(new File("sounds/b.wav"));
    }
    public static void wlaczDzwiek13(){
        playSound(new File("sounds/c1.wav"));
    }
    public static void wlaczDzwiek14(){
        playSound(new File("sounds/cis1.wav"));
    }
    public static void wlaczDzwiek15(){
        playSound(new File("sounds/d1.wav"));
    }
    public static void wlaczDzwiek16(){
        playSound(new File("sounds/dis1.wav"));
    }
    public static void wlaczDzwiek17(){
        playSound(new File("sounds/e1.wav"));
    }


    public static synchronized void playSound (final File f){
        new Thread(new Runnable() {
            public void run() {
                try {
                    Clip clip = AudioSystem.getClip();
                    AudioInputStream inputStream = AudioSystem.getAudioInputStream(f);
                    clip.open(inputStream);
                    clip.start();
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
        }).start();
    }
}


