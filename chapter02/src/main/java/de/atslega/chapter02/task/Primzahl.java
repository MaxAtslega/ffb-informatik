package de.atslega.chapter02.task;

import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        System.out.println("Primzahlpruefung");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ganze Zahl eingeben: ");
        int zahl = Integer.parseInt(scanner.nextLine());

        boolean primzahl = (zahl % 2) != 0 && (zahl % 3) != 0;

        System.out.println(zahl + " ist " + (primzahl ? "eine" : "keine") + " Primzahl");
        System.out.println("Programmende Primzahl");
    }
}
