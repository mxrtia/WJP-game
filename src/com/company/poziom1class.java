package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class poziom1class implements ActionListener{

    public static GameWindow g;
    public JButton poziom1;
    public static JButton poziom2;
    public static JButton poziom3;
    public static JButton poziom4;
    public static JButton opcje;

    public static JButton key1;
    public static JButton key2;
    public static JButton key3;
    public static JButton key4;
    public static JButton key5;
    public static JButton key6;
    public static JButton key7;
    public static JButton key8;
    public static JButton key9;
    public static JButton key10;
    public static JButton key11;
    public static JButton key12;
    public static JButton key13;
    public static JButton key14;
    public static JButton key15;
    public static JButton key16;
    public static JButton key17;
    public static JButton klawiatura;
    public static JButton miniklawa;
    public static JButton start;
    //public static JButton wroc;
    public static JButton klawiaturabezdzwiekow;
    public static JButton klawiaturazdzwiekami;
    public static JButton wyjscie;
    public static JTextArea informacja;
    public static JButton arrow;
    public static JTextArea koniec;
    public static JButton padlock;
    public static JButton padlock2;
    public static JButton padlock3;
    static JButton pomoc;

    /** POZIOM 1 **/
    //ustalenie sekwencji przycisków klawiatury, które musi wcisnąć gracz, aby prawidłowo przejść dany poziom
    public static int[] keyeventy ={KeyEvent.VK_Y, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_W, KeyEvent.VK_R, KeyEvent.VK_Y,
            KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_E,
            KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_Y, KeyEvent.VK_R, KeyEvent.VK_W,
            KeyEvent.VK_T, KeyEvent.VK_7, KeyEvent.VK_O,
            KeyEvent.VK_I, KeyEvent.VK_7, KeyEvent.VK_Y,
            KeyEvent.VK_R, KeyEvent.VK_Y, KeyEvent.VK_T,
            KeyEvent.VK_R, KeyEvent.VK_E,
            KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T, KeyEvent.VK_Y,
            KeyEvent.VK_R, KeyEvent.VK_W, KeyEvent.VK_ENTER}; //36 elementów + enter = 37 elementów
    //ustalenie miejsc na osi X w których ma się pojawić strzałka wskazująca odpowiedni dźwięk
    public static int[] XPos ={396, 459, 564,
            459, 396, 296,
            296, 459, 653,
            564, 459, 396,
            396, 459, 564,
            653, 459, 296,
            564, 698, 925, 819, 698, 653,
            459, 653, 564, 459, 396,
            396, 459, 564, 653,
            459, 296, 396}; //(36 niebieskich elementów(35+1poziom2) [+ 1 w mainie])

    public static int counter = 0;
    public static int last = 36;

    /** POZIOM 2 **/

    public static int[] keyeventy2 ={KeyEvent.VK_E, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_E,
            KeyEvent.VK_E, KeyEvent.VK_W, KeyEvent.VK_W,
            KeyEvent.VK_E, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_E,
            KeyEvent.VK_W, KeyEvent.VK_Q, KeyEvent.VK_Q,
            KeyEvent.VK_W, KeyEvent.VK_W, KeyEvent.VK_E, KeyEvent.VK_Q,
            KeyEvent.VK_W, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_Q,
            KeyEvent.VK_W, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_W,
            KeyEvent.VK_E, KeyEvent.VK_E, KeyEvent.VK_R, KeyEvent.VK_T,
            KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_E, KeyEvent.VK_W,
            KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_W, KeyEvent.VK_E,
            KeyEvent.VK_W, KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_ENTER}; //62 elementy + enter = 63 elementy
    public static int[] XPos2 ={396, 459, 564,
            564, 459, 396, 296,
            190, 190, 296, 396,
            396, 296, 296,
            396, 396, 459, 564,
            564, 459, 396, 296,
            190, 190, 296, 396,
            296, 190, 190,
            296, 296, 396, 190,
            296, 396, 459, 396, 190,
            296, 396, 459, 396, 296,
            190, 296, 296,
            396, 396, 459, 564,
            564, 459, 396, 296,
            190, 190, 296, 396,
            296, 190, 190, 190}; //62 elementy (1 w poziomie1, 62+jeden do następnego)

    public static int counter2 = 0;
    public static int last2 = 62;

    /** POZIOM 3 **/

    public static int[] keyeventy3 ={KeyEvent.VK_Q, KeyEvent.VK_Y, KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_Q,
            KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_Y, KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_W,
            KeyEvent.VK_W, KeyEvent.VK_W, KeyEvent.VK_7, KeyEvent.VK_Y, KeyEvent.VK_T, KeyEvent.VK_E,
            KeyEvent.VK_I, KeyEvent.VK_I, KeyEvent.VK_7, KeyEvent.VK_T, KeyEvent.VK_Y,
            KeyEvent.VK_Q, KeyEvent.VK_Y, KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_Q,
            KeyEvent.VK_Q, KeyEvent.VK_Q, KeyEvent.VK_Y, KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_W,
            KeyEvent.VK_W, KeyEvent.VK_W, KeyEvent.VK_7, KeyEvent.VK_Y, KeyEvent.VK_T,
            KeyEvent.VK_I, KeyEvent.VK_I, KeyEvent.VK_I, KeyEvent.VK_I,
            KeyEvent.VK_O, KeyEvent.VK_I, KeyEvent.VK_Y, KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_I,
            KeyEvent.VK_Y, KeyEvent.VK_Y, KeyEvent.VK_Y, //51
            KeyEvent.VK_Y, KeyEvent.VK_Y, KeyEvent.VK_Y,
            KeyEvent.VK_Y, KeyEvent.VK_I, KeyEvent.VK_R, KeyEvent.VK_T, KeyEvent.VK_Y,
            KeyEvent.VK_7, KeyEvent.VK_7, KeyEvent.VK_7, KeyEvent.VK_7,
            KeyEvent.VK_7, KeyEvent.VK_Y, KeyEvent.VK_Y, KeyEvent.VK_Y,
            KeyEvent.VK_Y, KeyEvent.VK_T, KeyEvent.VK_T, KeyEvent.VK_R, KeyEvent.VK_T, KeyEvent.VK_I,
            KeyEvent.VK_Y, KeyEvent.VK_Y, KeyEvent.VK_Y,
            KeyEvent.VK_Y, KeyEvent.VK_Y, KeyEvent.VK_Y, //79
            KeyEvent.VK_Y, KeyEvent.VK_I, KeyEvent.VK_R, KeyEvent.VK_T, KeyEvent.VK_Y,
            KeyEvent.VK_7, KeyEvent.VK_7, KeyEvent.VK_7, KeyEvent.VK_7,
            KeyEvent.VK_7, KeyEvent.VK_Y, KeyEvent.VK_Y, KeyEvent.VK_Y,
            KeyEvent.VK_I, KeyEvent.VK_I, KeyEvent.VK_7, KeyEvent.VK_T, KeyEvent.VK_R,
            KeyEvent.VK_ENTER}; //97 elementów + enter = 98 elementów

    public static int[] XPos3 ={653, 564, 459, 190,
            190, 190, 653, 564, 459, 296,
            296, 296, 698, 653, 564, 396,
            819, 819, 698, 564, 653,
            190, 653, 564, 459, 190,
            190, 190, 653, 564, 459, 296,
            296, 296, 698, 653, 564,
            819, 819, 819, 819,
            925, 819, 653, 564, 459, 819,
            653, 653, 653,
            653, 653, 653,
            653, 819, 459, 564, 653,
            698, 698, 698, 698,
            698, 653, 653, 653,
            653, 564, 564, 459, 564, 819,
            653, 653, 653,
            653, 653, 653,
            653, 819, 459, 564, 653,
            698, 698, 698, 698,
            698, 653, 653, 653,
            819, 819, 698, 564, 459, 1020}; //97 elementów (1 w poziomie2, 97+jeden do następnego)

    public static int counter3 = 0;
    public static int last3 = 97;

    /** POZIOM 4 **/

    public static int keyeventy4[]={KeyEvent.VK_P, KeyEvent.VK_0, KeyEvent.VK_P, KeyEvent.VK_0, KeyEvent.VK_P,
            KeyEvent.VK_U, KeyEvent.VK_O, KeyEvent.VK_I, KeyEvent.VK_Y,
            KeyEvent.VK_Q, KeyEvent.VK_E, KeyEvent.VK_Y, KeyEvent.VK_U,
            KeyEvent.VK_E, KeyEvent.VK_Y, KeyEvent.VK_U, KeyEvent.VK_I,
            KeyEvent.VK_E, KeyEvent.VK_P, KeyEvent.VK_0, KeyEvent.VK_P, KeyEvent.VK_0, KeyEvent.VK_P,
            KeyEvent.VK_U, KeyEvent.VK_O, KeyEvent.VK_I, KeyEvent.VK_Y,
            KeyEvent.VK_Q, KeyEvent.VK_E, KeyEvent.VK_Y, KeyEvent.VK_U,
            KeyEvent.VK_E, KeyEvent.VK_I, KeyEvent.VK_U, KeyEvent.VK_Y,
            KeyEvent.VK_U, KeyEvent.VK_I, KeyEvent.VK_O, KeyEvent.VK_P,
            KeyEvent.VK_P, KeyEvent.VK_P, KeyEvent.VK_O, KeyEvent.VK_O,
            KeyEvent.VK_I, KeyEvent.VK_I, KeyEvent.VK_U,
            KeyEvent.VK_P, KeyEvent.VK_0, KeyEvent.VK_P, KeyEvent.VK_0, KeyEvent.VK_P,
            KeyEvent.VK_U, KeyEvent.VK_O, KeyEvent.VK_I, KeyEvent.VK_Y,
            KeyEvent.VK_Q, KeyEvent.VK_E, KeyEvent.VK_Y, KeyEvent.VK_U,
            KeyEvent.VK_E, KeyEvent.VK_Y, KeyEvent.VK_U, KeyEvent.VK_I,
            KeyEvent.VK_E, KeyEvent.VK_P, KeyEvent.VK_0, KeyEvent.VK_P, KeyEvent.VK_0, KeyEvent.VK_P,
            KeyEvent.VK_U, KeyEvent.VK_O, KeyEvent.VK_I, KeyEvent.VK_Y,
            KeyEvent.VK_Q, KeyEvent.VK_E, KeyEvent.VK_Y, KeyEvent.VK_U,
            KeyEvent.VK_E, KeyEvent.VK_I, KeyEvent.VK_U, KeyEvent.VK_Y, KeyEvent.VK_ENTER}; // 81 elementów + enter

    public static int XPos4[]={969, 1020, 969, 1020,
            744, 929, 819, 653,
            190, 396, 653, 744,
            396, 653, 744, 819,
            396, 1020, 969, 1020, 969, 1020,
            744, 929, 819, 653,
            190, 396, 653, 744, //30
            396, 819, 744, 653,
            744, 819, 925, 1020,
            1020, 1020, 925, 925,
            819, 819, 744,
            1020, 969, 1020, 969, 1020, //50
            744, 929, 819, 653,
            190, 396, 653, 744,
            396, 653, 744, 819,
            396, 1020, 969, 1020, 969, 1020,
            744, 929, 819, 653,
            190, 396, 653, 744,
            396, 819, 744, 653, 1400}; //82 elementy (1 w mainie, 61+jeden do następnego)

    public static int counter4 = 0;
    public static int last4 = 81;

    public static double startTime; //MOMENT W KTÓRYM TIMER STARTUJE
    public static double estimatedTime; //MOMENT W KTÓRYM TIMER STOPUJE
    static int value;
    static double czas;
    public static int pts; //LICZBA PUNKTÓW

    public poziom1class(GameWindow gw) {
        g = gw;
        this.poziom1 = Main.poziom1;
        this.poziom2 = Main.poziom2;
        this.poziom3 = Main.poziom3;
        this.poziom4 = Main.poziom4;
        this.opcje = Main.opcje;
        this.klawiatura = Main.klawiatura;
        this.miniklawa = Main.miniklawa;
        this.start = Main.start;
        this.key1 = Main.key1;
        this.key2 = Main.key2;
        this.key3 = Main.key3;
        this.key4 = Main.key4;
        this.key5 = Main.key5;
        this.key6 = Main.key6;
        this.key7 = Main.key7;
        this.key8 = Main.key8;
        this.key9 = Main.key9;
        this.key10 = Main.key10;
        this.key11 = Main.key11;
        this.key12 = Main.key12;
        this.key13 = Main.key13;
        this.key14 = Main.key14;
        this.key15 = Main.key15;
        this.key16 = Main.key16;
        this.key17 = Main.key17;
        this.klawiaturabezdzwiekow = Main.klawiaturabezdzwiekow;
        this.klawiaturazdzwiekami = Main.klawiaturazdzwiekami;
        this.wyjscie = Main.wyjscie;
        pomoc = Main.pomoc;
        this.informacja = Main.informacja;
        this.arrow = Main.arrow;
        padlock = Main.padlock;
        padlock2 = Main.padlock2;
        padlock3 = Main.padlock3;

        koniec = new JTextArea();
        koniec.setEditable(false);
        koniec.setText("Gratulacje! Udało ci się ukończyć poziom. \nTwój wynik: PTS \nTwój czas: "+estimatedTime+"s");
        Font czcionka = new Font ("Impact", Font.PLAIN, 40);
        koniec.setFont(czcionka);
        koniec.setForeground(Color.white);
        koniec.setBounds(100, 700, 1000, 500);
        koniec.setOpaque(false);
        koniec.setVisible(false);


        g.ButtonImage(arrow, "res/images/arrow.png", 653, 135, false);
    }

    //co się stanie jak klikniesz poziom1???
    public void actionPerformed(ActionEvent e)
    {

        g.add(klawiatura);
        g.add(arrow);
        g.add(koniec);

        klawiatura.setVisible(true);
        key1.setVisible(false);
        key2.setVisible(false);
        key3.setVisible(false);
        key4.setVisible(false);
        key5.setVisible(false);
        key6.setVisible(false);
        key7.setVisible(false);
        key8.setVisible(false);
        key9.setVisible(false);
        key10.setVisible(false);
        key11.setVisible(false);
        key12.setVisible(false);
        key13.setVisible(false);
        key14.setVisible(false);
        key15.setVisible(false);
        key16.setVisible(false);
        key17.setVisible(false);
        //poziom1.setVisible(false);
        poziom2.setVisible(false);
        poziom3.setVisible(false);
        poziom4.setVisible(false);
        padlock.setVisible(false);
        padlock2.setVisible(false);
        padlock3.setVisible(false);
        opcje.setVisible(true);
        miniklawa.setVisible(true);
        start.setVisible(true);
        informacja.setVisible(true);
        informacja.setText("MELODIA: Korobeiniki");
        informacja.setLocation(350, 945);

        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher()); //dodanie keyeventdispatchera (stworzony w klasie MyDispatcher)

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                startTime = System.currentTimeMillis();
                start.setVisible(false);
                arrow.setVisible(true);
            }
        });
    }

    public class MyDispatcher implements KeyEventDispatcher {
        @Override
        public boolean dispatchKeyEvent(KeyEvent ke) {
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_Q) {
                PianoTime.wlaczDzwiek1();
                key1.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_Q){
                key1.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_2) {
                PianoTime.wlaczDzwiek2();
                key2.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_2){
                key2.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_W) {
                PianoTime.wlaczDzwiek3();
                key3.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_W){
                key3.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_3) {
                PianoTime.wlaczDzwiek4();
                key4.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_3){
                key4.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_E) {
                PianoTime.wlaczDzwiek5();
                key5.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_E){
                key5.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_R) {
                PianoTime.wlaczDzwiek6();
                key6.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_R){
                key6.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_5) {
                PianoTime.wlaczDzwiek7();
                key7.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_5){
                key7.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_T) {
                PianoTime.wlaczDzwiek8();
                key8.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_T){
                key8.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_6) {
                PianoTime.wlaczDzwiek9();
                key9.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_6){
                key9.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_Y) {
                PianoTime.wlaczDzwiek10();
                key10.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_Y){
                key10.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_7) {
                PianoTime.wlaczDzwiek11();
                key11.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_7){
                key11.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_U) {
                PianoTime.wlaczDzwiek12();
                key12.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_U){
                key12.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_I) {
                PianoTime.wlaczDzwiek13();
                key13.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_I){
                key13.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_9) {
                PianoTime.wlaczDzwiek14();
                key14.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_9){
                key14.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_O) {
                PianoTime.wlaczDzwiek15();
                key15.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_O){
                key15.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_0) {
                PianoTime.wlaczDzwiek16();
                key16.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_0){
                key16.setVisible(false);
            }
            if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == KeyEvent.VK_P) {
                PianoTime.wlaczDzwiek17();
                key17.setVisible(true);
            }
            if(ke.getID() == KeyEvent.KEY_RELEASED && ke.getKeyCode() == KeyEvent.VK_P){
                key17.setVisible(false);
            }

            if(poziom1.isVisible() && arrow.isVisible()) {
                if (counter != last) {
                    if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == keyeventy[counter]) {
                        arrow.setLocation(XPos[counter], 135);
                        counter++;
                        if (counter == 36) {
                            koniec.setVisible(true);
                            estimatedTime = (System.currentTimeMillis() - startTime)/1000;
                            czas = estimatedTime;
                            value = (int)czas;
                            pts = (value*177-10000); //obliczenie wyniku
                            pts = Math.abs(pts); //obliczenie wyniku
                            koniec.setText("Gratulacje! Udało ci się ukończyć POZIOM1. \nTwój wynik: "+pts+" PTS \nTwój czas: "+estimatedTime+"s");

                            poziom1.setVisible(false);
                            poziom2.setVisible(true);
                            poziom2.addActionListener(new poziom2class(g, opcje));
                            poziom3.setVisible(true);
                            poziom4.setVisible(true);
                            padlock2.setVisible(true);
                            padlock3.setVisible(true);

                            opcje.setVisible(false);
                            klawiaturazdzwiekami.setVisible(false);
                            klawiaturabezdzwiekow.setVisible(false);
                            wyjscie.setVisible(true);
                            pomoc.setVisible(true);
                            miniklawa.setVisible(false);
                            klawiatura.setVisible(true);
                            arrow.setVisible(false);
                            informacja.setVisible(false);
                        }
                    }
                }
            }
            if(poziom2.isVisible() && arrow.isVisible()) {
                if (counter2 != last2) {
                    if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == keyeventy2[counter2]) {
                        arrow.setLocation(XPos2[counter2], 135);
                        counter2++;
                        if (counter2 == 62) {
                            estimatedTime = (System.currentTimeMillis() - startTime)/1000;
                            czas = estimatedTime;
                            value = (int)czas;
                            pts = (value*177-12000);
                            pts = Math.abs(pts);
                            koniec.setText("Gratulacje! Udało ci się ukończyć POZIOM2. \nTwój wynik: "+pts+" PTS \nTwój czas: "+estimatedTime+"s");

                            poziom1.setVisible(false);
                            poziom2.setVisible(false);
                            poziom3.setVisible(true);
                                poziom3.addActionListener(new poziom3class(g, opcje));
                            poziom4.setVisible(true);
                                padlock3.setVisible(true);

                            miniklawa.setVisible(false);
                            klawiatura.setVisible(true);
                            koniec.setVisible(true);
                            poziom3.setVisible(true);
                            opcje.setVisible(false);
                            klawiaturazdzwiekami.setVisible(false);
                            klawiaturabezdzwiekow.setVisible(false);
                            wyjscie.setVisible(true);
                            pomoc.setVisible(true);
                            arrow.setVisible(false);
                            informacja.setVisible(false);
                        }
                    }
                }
            }
            if(poziom3.isVisible() && arrow.isVisible()) {
                if (counter3 != last3) {
                    if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == keyeventy3[counter3]) {
                        arrow.setLocation(XPos3[counter3], 135);
                        counter3++;
                        if (counter3 == 97) {
                            estimatedTime = (System.currentTimeMillis() - startTime)/1000;
                            czas = estimatedTime;
                            value = (int)czas;
                            pts = (value*177-15000);
                            pts = Math.abs(pts);
                            koniec.setText("Gratulacje! Udało ci się ukończyć POZIOM3. \nTwój wynik: "+pts+" PTS \nTwój czas: "+estimatedTime+"s");

                            poziom1.setVisible(false);
                            poziom2.setVisible(false);
                            poziom3.setVisible(false);
                            poziom4.setVisible(true);
                                poziom4.addActionListener(new poziom4class(g, opcje));

                            miniklawa.setVisible(false);
                            klawiatura.setVisible(true);
                            koniec.setVisible(true);
                            poziom4.setVisible(true);
                            opcje.setVisible(false);
                            klawiaturazdzwiekami.setVisible(false);
                            klawiaturabezdzwiekow.setVisible(false);
                            wyjscie.setVisible(true);
                            pomoc.setVisible(true);
                            arrow.setVisible(false);
                            informacja.setVisible(false);
                        }
                    }
                }
            }
            if(poziom4.isVisible() && arrow.isVisible()) {
                if (counter4 != last4) {
                    if (ke.getID() == KeyEvent.KEY_PRESSED && ke.getKeyCode() == keyeventy4[counter4]) {
                        arrow.setLocation(XPos4[counter4], 135);
                        counter4++;
                        if (counter4 == 81) {
                            estimatedTime = (System.currentTimeMillis() - startTime)/1000;
                            czas = estimatedTime;
                            value = (int)czas;
                            pts = (value*177-20000);
                            pts = Math.abs(pts);
                            koniec.setText("Gratulacje! Udało ci się ukończyć POZIOM4. \nTwój wynik: "+pts+" PTS \nTwój czas: "+estimatedTime+"s\n \nKONIEC GRY");


                            poziom3.setVisible(false);
                            miniklawa.setVisible(false);
                            klawiatura.setVisible(true);
                            koniec.setVisible(true);
                            poziom4.setVisible(false);
                            opcje.setVisible(false);
                            klawiaturazdzwiekami.setVisible(false);
                            klawiaturabezdzwiekow.setVisible(false);
                            wyjscie.setVisible(true);
                            pomoc.setVisible(true);
                            arrow.setVisible(false);
                            informacja.setVisible(false);
                        }
                    }
                }
            }
            return false;
        }
    }
}
