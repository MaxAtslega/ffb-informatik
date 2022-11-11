package de.atslega.chapter02.task;

import java.util.Scanner;

public class Teiler {
    public static void main(String[] args) {
        System.out.println("Teiler");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine ganze Zahl ein: ");
        int zahl = Integer.parseInt(scanner.nextLine());

        StringBuilder text = new StringBuilder();

        int i = 1;
        do {
            if(zahl % i == 0){
                System.out.print(i+" ");
            }
            i++;
        } while (i <= zahl);

        System.out.println("teilbar.");
        System.out.println("Programmende Teiler.");

    }
}
