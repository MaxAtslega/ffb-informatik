package de.atslega.chapter02.task;

import java.util.Scanner;

public class SumNa {
    public static void main(String[] args) {
        System.out.println("SumNa");
        System.out.println("Berechnung der Summe der Reihe \n 1*1+2*2+3*3+4*4+...+n*n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine pos. ganze Zahl ein (n): ");
        int zahl = Integer.parseInt(scanner.nextLine());

        int add = 0;
        for (int i = 1; i <= zahl; i++) {
            add += i * i;
        }

        System.out.println("Summe ist: " + add);
        System.out.println("Programmende SumNa.");
    }
}
