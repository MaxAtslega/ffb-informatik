package de.atslega.chapter03.task1;

import java.util.Arrays;

public class Formen {
    public static void main(String[] args) {
        Dreieck dreieck = new Dreieck(2,3,4);
        System.out.println("Dreieck seiteA: " + dreieck.getSeiteA());
        System.out.println("Dreieck seiteB: " + dreieck.getSeiteB());
        System.out.println("Dreieck seiteC: " + dreieck.getSeiteC());

        GeraderKreisKegel geraderKreisKegel = new GeraderKreisKegel(-5,-2);
        System.out.println("GeraderKreisKegel radius: " + geraderKreisKegel.getRadius());
        System.out.println("GeraderKreisKegel hoehe: " + geraderKreisKegel.getHoehe());

        GeraderKreisZylinder geraderKreisZylinder = new GeraderKreisZylinder(-5,-3);
        System.out.println("GeraderKreisZylinder radius: " + geraderKreisZylinder.getRadius());
        System.out.println("GeraderKreisZylinder hoehe: " + geraderKreisZylinder.getHoehe());

        Kreis kreis = new Kreis(1, 2, 5);
        System.out.println("Kreis radius: " + kreis.getRadius());

        Kugel kugel = new Kugel(2);
        System.out.println("Kugel radius: " + kugel.getRadius());

        Quader quader = new Quader(-3,-55,-4);
        System.out.println("Quader seiteA: " + quader.getSeiteA());
        System.out.println("Quader seiteB: " + quader.getSeiteB());
        System.out.println("Quader seiteC: " + quader.getSeiteC());

        Wuerfel wuerfel = new Wuerfel(-4);
        System.out.println("Wuerfel seiteA: " + wuerfel.getSeiteA());

    }

}
