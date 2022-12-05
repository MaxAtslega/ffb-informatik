package de.atslega.chapter03;

import de.atslega.chapter03.task1.Kreis;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){
        setTitle("Test");
        setSize(800, 450);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g){
        Kreis kreis1 = new Kreis(100, 100, 50);
        kreis1.draw(g);

        Kreis kreis2 = new Kreis(150, 150, 50);
        kreis2.draw(g);
    }
}
