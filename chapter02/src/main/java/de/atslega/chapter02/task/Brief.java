package de.atslega.chapter02.task;

import java.util.Scanner;

public class Brief {
    public static void main(String[] args) {
        System.out.println("Portoberechnung");
        Scanner input = new Scanner(System.in);

        System.out.print("Gewicht des Briefes in g: ");
        double gewicht = Double.parseDouble(input.nextLine());


        double preis = 0;

        if(gewicht <= 20) {
            preis = 1.00;
        } else if (gewicht <= 50) {
            preis = 1.70;
        } else if (gewicht <= 100) {
            preis = 2.40;
        } else if (gewicht <= 250) {
            preis = 3.20;
        } else if (gewicht <= 500) {
            preis = 4.00;
        } else if (gewicht <= 1000) {
            preis = 4.80;
        }

        if(preis != 0){
            System.out.println("Kosten: " + preis + " Euro");
        } else {
            System.out.println("Man kann nur ein Brief unter 1kg verschicken.");
        }

        System.out.println("Programmende Brief");
    }
}
