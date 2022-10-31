package de.atslega.chapter02.task;

import java.util.Scanner;

public class KinderG {
    public static void main(String[] args) {
        System.out.println("Kindergeldabrechnung");
        Scanner input = new Scanner(System.in);

        System.out.print("Ihr Jahreseinkommen in D$: ");
        double jahreseinkommen = Double.parseDouble(input.nextLine());

        System.out.print("Anzahl der Kinder: ");
        int anzahlKinder = Integer.parseInt(input.nextLine());

        double kindergeld = 0;

        if (jahreseinkommen < 45000.00){
            if (anzahlKinder == 1){
                kindergeld = 70.0;
            } else if (anzahlKinder == 2) {
                kindergeld = 130.0;
            } else if ( anzahlKinder == 3) {
                kindergeld = 220.0;
            }else {
                kindergeld = 240.0;
            }
        } else {
            if (anzahlKinder == 1){
                kindergeld = 70.0;
            } else if (anzahlKinder == 2) {
                kindergeld = 70.0;
            } else if ( anzahlKinder == 3) {
                kindergeld = 140.0;
            }else {
                kindergeld = 140.0;
            }
        }

        System.out.println("Ergebnis: " + kindergeld + " D$ Kindergeld.");
        System.out.println("Programmende Kindergeld");
    }
}
