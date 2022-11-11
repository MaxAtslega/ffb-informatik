package de.atslega.chapter02.task;

import java.util.Scanner;

public class SumNc {
    public static void main(String[] args) {
        System.out.println("SumNc");
        System.out.println("Berechnung der Summe der Reihe \n 2*2+4*4+6*6+...+(2n)*(2n)");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine pos. ganze Zahl ein (n): ");
        int zahl = Integer.parseInt(scanner.nextLine());

        int add = 0;
        for (int i = 1; i <= zahl; i++){
            add+=(2*i)*(2*i);
        }

        System.out.println("Summe ist: " + add);
        System.out.println("Programmende SumNc.");
    }
}
