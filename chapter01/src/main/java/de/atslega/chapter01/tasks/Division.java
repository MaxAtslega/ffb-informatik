package de.atslega.chapter01.tasks;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        System.out.println("Division zweier ganzen Zahlen.");
        double zahl1, zahl2, ergebnis;

        Scanner input = new Scanner(System.in);

        System.out.print("Zahl1: ");
        zahl1 = Double.parseDouble(input.nextLine());

        System.out.print("Zahl2: ");
        zahl2 = Double.parseDouble(input.nextLine());

        ergebnis = zahl1 / zahl2;

        System.out.println("Das Ergebnis der Division " + zahl1 + "/" + zahl2 + " ist " + ergebnis);

        System.out.println("Programmende Subtraktion.");
    }
}
