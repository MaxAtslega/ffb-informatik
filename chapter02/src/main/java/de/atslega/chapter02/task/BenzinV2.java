package de.atslega.chapter02.task;

import java.util.Scanner;

public class BenzinV2 {
    public static void main(String[] args) {
        System.out.println("Berechnung des Durchschnittsverbrauch");

        Scanner input = new Scanner(System.in);

        System.out.print("verbrauchter Kraftstoff in l: ");
        double kraftstoff = Double.parseDouble(input.nextLine());

        System.out.print("gefahrene Strecke in km: ");
        double strecke = Double.parseDouble(input.nextLine());

        if (strecke == 0) {
            System.out.println("Ungültige Strecke eingegeben");
        } else {
            double durchschnitt = kraftstoff / strecke * 100;
            System.out.println("Der Durchschnittsverbrauch ist " + durchschnitt + " l/100km");
        }

        System.out.println("Programmende Subtraktion.");
    }
}
