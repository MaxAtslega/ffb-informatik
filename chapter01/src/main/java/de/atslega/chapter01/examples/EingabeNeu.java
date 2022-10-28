package de.atslega.chapter01.examples;

import java.util.Scanner;

public class EingabeNeu {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Name eingeben: ");
        name = input.nextLine();

        System.out.print("Guten Tag Benutzer ");
        System.out.println(name);

        System.out.println("Programmende Eingeben.");
    }
}
