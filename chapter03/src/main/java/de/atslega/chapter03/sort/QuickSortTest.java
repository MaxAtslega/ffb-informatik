package de.atslega.chapter03.sort;

public class QuickSortTest {


    public static void quickSort(int[] array, int start, int end){
        if (start >= end) return;

        int pivotLocation = partition(array, start, end);
        quickSort(array, start, pivotLocation-1);
        quickSort(array, pivotLocation+1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int i = start;


        return i;
    }
}
