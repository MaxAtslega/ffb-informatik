package de.atslega.chapter02.task;

import java.util.Scanner;

public class Bestell2 {
    public static void main(String[] args) {
        System.out.println("Rechnung des Rechnungsbetrages");
        Scanner input = new Scanner(System.in);

        System.out.print("Bestellwert in Euro: ");
        double betrag = Double.parseDouble(input.nextLine());

        if (betrag < 100.0) {
            betrag += 5.50;
        } else if (betrag > 100 && betrag < 200) {
            betrag += 3.00;
        }

        System.out.println("Rechnungsbetrag: " + betrag);

        System.out.println("Programmende Bestell.");
    }
}
