package de.atslega.chapter03.sort;

import java.util.ArrayList;
import java.util.Random;

public class QuickSort {

    public static int compare = 0;
    public static int swap = 0;

    public static void schleifenZaehler(int n) {
        for (int i = 1; i <= n; i = i * 2) {
            System.out.println("Schleifenzähler: " + i);
        }
    }

    public static void main(String[] args) {
        schleifenZaehler(100);
        int runs = 10_000;
        int size = 5;
        int range = 100;

        ArrayList<Long[]> quickSortList = new ArrayList<>();


        for (int i = 1; i <= runs; i++) {
            int[] randomArray = new Random().ints(size, 0, range).toArray();
            long start = System.nanoTime();
            quickSort(randomArray, 0, randomArray.length - 1);
            long end = System.nanoTime();
            long time = (end - start);

            quickSortList.add(new Long[]{time, (long) compare, (long) swap});
            compare = 0;
            swap = 0;
        }

        double quickSortTimeAverage = quickSortList.stream().mapToDouble(d -> d[0]).average().orElse(0.0);
        double quickSortCompareAverage = quickSortList.stream().mapToDouble(d -> d[1]).average().orElse(0.0);
        double quickSortSwapAverage = quickSortList.stream().mapToDouble(d -> d[2]).average().orElse(0.0);


        System.out.println("Average-Case of " + runs + " runs with a size of " + size + ":");
        System.out.println("- Quick Sort: Time: " + quickSortTimeAverage + "ns Compare: " + quickSortCompareAverage + " Swap: " + quickSortSwapAverage);

    }

    public static void quickSort(int[] array, int start, int end) {

        if (start >= end) return;

        int pivotPosition = partition(array, start, end);
        quickSort(array, start, pivotPosition - 1);
        quickSort(array, pivotPosition + 1, end);
    }

    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];

        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                swap++;
            }
            compare++;
        }
        int swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;
        swap++;

        return i + 1;
    }
}
