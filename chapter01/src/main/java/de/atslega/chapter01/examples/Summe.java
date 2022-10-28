package de.atslega.chapter01.examples;

import java.util.Scanner;

public class Summe {
    public static void main(String[] args) {
        int zahl1, zahl2, ergebnis;
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein: ");
        zahl1 = Integer.parseInt(input.nextLine());

        System.out.println("Geben Sie die zweite Zahl ein: ");
        zahl2 = Integer.parseInt(input.nextLine());

        ergebnis = zahl1 + zahl2;

        System.out.println("Die Summe von "+ zahl1+ " und " + zahl2 + " ist: "+ ergebnis);

        System.out.println("Programmende Summe.");
    }
}
