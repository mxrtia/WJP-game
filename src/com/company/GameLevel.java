package com.company;

public class GameLevel {
    public int points; //ilość punktów w danym poziomie
    public int level; //który poziom
    public double time; //czas gry w danym poziomie

    public void reset(){ //resetuj parametry gry
        points = 0;
        level = 1;
        time = 0.0;
    }

    public void resetPoints(){
        points=0;
    }

    public void nextLevel(){
        level++;
    }
}
