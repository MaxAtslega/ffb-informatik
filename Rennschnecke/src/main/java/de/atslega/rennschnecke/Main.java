package de.atslega.rennschnecke;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rennschnecke rennschnecke1 = new Rennschnecke("Max", "Wolf", 250, 0);
        rennschnecke1.krieche();
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

        Wettbuero wettbuero = new Wettbuero(rennen, wetten, 2);
        wettbuero.rennenDurchfuehren();
        System.out.println(wettbuero.toString());


    }
}