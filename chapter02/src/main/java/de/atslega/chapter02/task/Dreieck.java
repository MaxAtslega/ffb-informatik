package de.atslega.chapter02.task;

import java.util.Scanner;

public class Dreieck {
    public static void main(String[] args) {
        System.out.println("Konstruierbarkeit eines Dreiecks prüfen");
        Scanner input = new Scanner(System.in);

        System.out.print("Seite a: ");
        double seiteA = Double.parseDouble(input.nextLine());

        System.out.print("Seite b: ");
        double seiteB = Double.parseDouble(input.nextLine());

        System.out.print("Seite c: ");
        double seiteC = Double.parseDouble(input.nextLine());

        String message = "nicht konstruierbar.";

        if(seiteA + seiteB > seiteC && seiteA + seiteC > seiteB && seiteB + seiteC > seiteA){
            message = "konstruierbar.";
        };

        System.out.println("Das Dreieck ist " + message);

        System.out.println("Programmende Dreieck.");
    }
}
