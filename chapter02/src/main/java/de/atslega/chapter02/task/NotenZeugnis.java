package de.atslega.chapter02.task;

import java.util.Scanner;

public class NotenZeugnis {
    public static void main(String[] args) {
        System.out.println("NotenZeugnis");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl Schüler: ");
        int anzahlSchueler = scanner.nextInt();

        double[][] schuelerNoten = new double[anzahlSchueler][];

        for (int i = 1; i <= anzahlSchueler; i++) {
            System.out.print(i + ". Schüler wie viel Noten: ");
            int noten = scanner.nextInt();
            schuelerNoten[i-1] = new double[noten];
            System.out.println();

            for (int y = 1; y <= noten; y++) {
                System.out.print(y + ". Note: ");
                double note = scanner.nextDouble();
                schuelerNoten[i-1][y-1] = note;
                System.out.println();
            }
        }

        for (int i = 0; i < schuelerNoten.length; i++) {
            double summeNoten = 0;
            double anzahl = schuelerNoten[i].length;

            for (int y = 0; y < schuelerNoten[i].length; y++) {
                summeNoten+= schuelerNoten[i][y];
            }
            
            System.out.println(i+1 + ". Schüler: Note " + (summeNoten/anzahl));
        }

    }
}
