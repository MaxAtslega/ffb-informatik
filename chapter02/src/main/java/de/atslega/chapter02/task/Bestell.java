package de.atslega.chapter02.task;

import java.util.Scanner;

public class Bestell {
    public static void main(String[] args) {
        System.out.println("Rechnung des Rechnungsbetrages");
        Scanner input = new Scanner(System.in);

        System.out.print("Bestellwert ind Euro: ");
        double betrag = Double.parseDouble(input.nextLine());

        if(betrag < 200.0) betrag+= 5.50;

        System.out.println("Rechnungsbetrag: "+ betrag);

        System.out.println("Programmende Bestell.");


    }
}
