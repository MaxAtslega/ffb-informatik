package de.atslega.rennschnecke;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rennschnecke rennschnecke1 = new Rennschnecke("Max", "Wolf", 250, 0);
        rennschnecke1.krieche();

        System.out.println(rennschnecke1);

        Rennschnecke rennschnecke2 = new Rennschnecke("Samuel", "Ziege", 93, 0);
        Rennschnecke rennschnecke3 = new Rennschnecke("Felix", "Frosch", 250, 0);

        ArrayList<Rennschnecke> list = new ArrayList<Rennschnecke>();
        list.add(rennschnecke1);
        list.add(rennschnecke2);
        list.add(rennschnecke3);
        Rennen rennen = new Rennen("Rennen1", list, 50);

        ArrayList<Wette> wetten = new ArrayList<Wette>();
        wetten.add(new Wette("Max", 500, "Atslega"));
        wetten.add(new Wette("Felix", 5000, "Menze"));

        System.out.println(rennen);

        Wettbuero wettbuero = new Wettbuero(rennen, wetten, 2);
        wettbuero.rennenDurchfuehren();
        System.out.println(wettbuero.toString());

        WettbueroForm dialog = new WettbueroForm();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}