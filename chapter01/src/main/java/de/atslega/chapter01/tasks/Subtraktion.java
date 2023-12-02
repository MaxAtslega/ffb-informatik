package de.atslega.chapter01.tasks;

import java.util.Scanner;

public class Subtraktion {
    public static void main(String[] args) {
        System.out.println("Subtraktion zweier ganzen Zahlen.");
        int zahl1, zahl2, ergebnis;
        Scanner input = new Scanner(System.in);

        System.out.print("Zahl1: ");
        zahl1 = Integer.parseInt(input.nextLine());

        System.out.print("Zahl2: ");
        zahl2 = Integer.parseInt(input.nextLine());

        ergebnis = zahl1 - zahl2;

        System.out.println("Das Ergebnis der Subtraktion " + zahl1 + "-" + zahl2 + " ist " + ergebnis);

        System.out.println("Programmende Subtraktion.");
    }
}
