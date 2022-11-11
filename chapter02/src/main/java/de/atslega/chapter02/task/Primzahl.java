package de.atslega.chapter02.task;

import java.util.Scanner;

public class Primzahl {
    public static void main(String[] args) {
        System.out.println("Primzahlpruefung");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ganze Zahl eingeben: ");
        int zahl = Integer.parseInt(scanner.nextLine());
        
        boolean primzahl = true;

        if(zahl <= 2) {
            primzahl = (zahl == 2);
        } else {
            int i = 2;
            while (i <= zahl / 2){
                if(zahl % i == 0){
                    primzahl = false;
                    break;
                }
                i++;
            }
        }

        System.out.println(zahl + " ist " + (primzahl ? "eine" : "keine") + " Primzahl");
        System.out.println("Programmende Primzahl");
    }
}
