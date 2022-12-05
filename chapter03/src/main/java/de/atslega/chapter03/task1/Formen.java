package de.atslega.chapter03.task1;

public class Formen {
    public static void main(String[] args) {
        Dreieck dreieck = new Dreieck(-20,-30,-20);
        System.out.println("Dreieck seiteA: " + dreieck.seiteA);
        System.out.println("Dreieck seiteB: " + dreieck.seiteB);
        System.out.println("Dreieck seiteC: " + dreieck.seiteC);

        GeraderKreisKegel geraderKreisKegel = new GeraderKreisKegel(-5,-2);
        System.out.println("GeraderKreisKegel radius: " + geraderKreisKegel.radius);
        System.out.println("GeraderKreisKegel hoehe: " + geraderKreisKegel.hoehe);

        GeraderKreisZylinder geraderKreisZylinder = new GeraderKreisZylinder(-5,-3);
        System.out.println("GeraderKreisZylinder radius: " + geraderKreisZylinder.radius);
        System.out.println("GeraderKreisZylinder hoehe: " + geraderKreisZylinder.hoehe);

        Kreis kreis = new Kreis(-5);
        System.out.println("Kreis radius: " + kreis.radius);

        Kugel kugel = new Kugel(-2);
        System.out.println("Kugel radius: " + kugel.radius);

        Quader quader = new Quader(-3,-55,-4);
        System.out.println("Quader seiteA: " + quader.seiteA);
        System.out.println("Quader seiteB: " + quader.seiteB);
        System.out.println("Quader seiteC: " + quader.seiteC);

        Wuerfel wuerfel = new Wuerfel(-4);
        System.out.println("Wuerfel seiteA: " + wuerfel.seiteA);

    }

}
