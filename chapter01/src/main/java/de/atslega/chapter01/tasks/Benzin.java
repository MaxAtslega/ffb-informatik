package de.atslega.chapter01.tasks;

import java.util.Scanner;

public class Benzin {
    public static void main(String[] args) {
        System.out.println("Berechnung des Durchschnittsverbrauch");

        Scanner input = new Scanner(System.in);

        System.out.print("verbrauchter Kraftstoff in l: ");
        double kraftstoff = Double.parseDouble(input.nextLine());

        System.out.print("gefahrene Strecke in km: ");
        double strecke = Double.parseDouble(input.nextLine());

        double durchschnitt = kraftstoff / strecke * 100;

        System.out.println("Der Durchschnittsverbrauch ist " + durchschnitt + " l/100km");

        System.out.println("Programmende Subtraktion.");
    }
}
