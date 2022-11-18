package de.atslega.chapter02.task;

import java.util.Scanner;

public class Koerper {
    public static void main(String[] args){
        System.out.println("Berechnen von Volumen/Oberfläche div. Körper");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte wählen sie  (Z)ylinder, (W)ürfel, (Q)uader, (K)reiskegel oder K(u)gel: ");
        String wahl = scanner.nextLine();

        System.out.println("Ihre Wahl: "+wahl);

        System.out.print("Kantenlänge in cm ");
        Double kantenlänge = Double.parseDouble(scanner.nextLine());

        switch (wahl) {
            case "Z" -> {
                System.out.println("Zylinder Oberfläche: " + Math.PI * kantenlänge * kantenlänge * kantenlänge);
                System.out.println("Zylinder Volumen: " + 2 * Math.PI * kantenlänge * (kantenlänge + kantenlänge));
            }
            case "W" -> {
                System.out.println("Würfel Oberfläche: " + 6 * kantenlänge * kantenlänge);
                System.out.println("Würfel Volumen: " + kantenlänge * kantenlänge * kantenlänge);
            }
            case "Q" -> {
                System.out.println("Quader Oberfläche: " + 2 * (3 * kantenlänge * kantenlänge));
                System.out.println("Quader Volumen: " + kantenlänge * kantenlänge * kantenlänge);
            }
            case "K" -> {
                System.out.println("Kreiskegel Oberfläche: " + (Math.PI * kantenlänge * kantenlänge) + (Math.PI * kantenlänge * Math.sqrt(kantenlänge * kantenlänge + kantenlänge * kantenlänge)));
                System.out.println("Kreiskegel Volumen: " + (Math.PI * kantenlänge * kantenlänge * kantenlänge) / 3);
            }
            case "u" -> {
                System.out.println("Kugel Oberfläche: " + 4 * Math.PI * kantenlänge * kantenlänge);
                System.out.println("Kugel Volumen: " + (4 * Math.PI * kantenlänge * kantenlänge * kantenlänge) / 3);
            }
            default -> System.out.println("Ihr Wahl existiert nicht.");
        }
    }
}
