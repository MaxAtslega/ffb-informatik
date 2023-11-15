package de.atslega.chapter03.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        ArrayList<Long[]> insertionSort = new ArrayList<>();
        ArrayList<Long[]> bubbleSort = new ArrayList<>();
        ArrayList<Long[]> selectionSort = new ArrayList<>();
        ArrayList<Long[]> javaSort = new ArrayList<>();

        int runs = 10_000;
        int size = 5;
        int range = 100;

        for (int i = 1; i <= runs; i++) {
            int[] randomArray = new Random().ints(size, 0, range).toArray();

            System.out.println("("+i+") Sort");
            long startInsertionSort = System.nanoTime();
            int[] array1 = insertionSort(randomArray.clone());
            long endInsertionSort = System.nanoTime();
            long timeInsertionSort = (endInsertionSort - startInsertionSort);

            //System.out.println("("+i+") Selection Sort");
            long startSelectionSort = System.nanoTime();
            int[] array2 = selectionSort(randomArray.clone());
            long endSelectionSort = System.nanoTime();
            long timeSelectionSort = (endSelectionSort - startSelectionSort);

            // System.out.println("("+i+") Bubble Sort");
            long startBubbleSort = System.nanoTime();
            int[] array3 = bubbleSort(randomArray.clone());
            long endBubbleSort = System.nanoTime();
            long timeBubbleSort = (endBubbleSort - startBubbleSort);

            // System.out.println("("+i+") Java Sort");
            long startJava = System.nanoTime();
            Arrays.sort(randomArray.clone());
            long endJava = System.nanoTime();
            long timeJava = (endJava - startJava);

            bubbleSort.add(new Long[]{timeBubbleSort, (long) array3[0], (long) array3[1]});
            insertionSort.add(new Long[]{timeInsertionSort, (long) array1[0], (long) array1[1]});
            javaSort.add(new Long[]{timeJava});
            selectionSort.add(new Long[]{timeSelectionSort, (long) array2[0], (long) array2[1]});
        }

        double selectionSortTimeAverage = selectionSort.stream().mapToDouble(d -> d[0]).average().orElse(0.0);
        int selectionSortCompareAverage = (int) selectionSort.stream().mapToDouble(d -> d[1]).average().orElse(0.0);
        int selectionSortSwapAverage = (int) selectionSort.stream().mapToDouble(d -> d[2]).average().orElse(0.0);

        double insertionSortTimeAverage = insertionSort.stream().mapToDouble(d -> d[0]).average().orElse(0.0);
        int insertionSortCompareAverage = (int) insertionSort.stream().mapToDouble(d -> d[1]).average().orElse(0.0);
        int insertionSortSwapAverage = (int) insertionSort.stream().mapToDouble(d -> d[2]).average().orElse(0.0);

        double bubbleSortTimeAverage = bubbleSort.stream().mapToDouble(d -> d[0]).average().orElse(0.0);
        int bubbleSortCompareAverage = (int) bubbleSort.stream().mapToDouble(d -> d[1]).average().orElse(0.0);
        int bubbleSortSwapAverage = (int) bubbleSort.stream().mapToDouble(d -> d[2]).average().orElse(0.0);

        double javaSortTimeAverage = javaSort.stream().mapToDouble(d -> d[0]).average().orElse(0.0);

        System.out.println("Average-Case of "+runs+" runs with a size of "+size+":");
        System.out.println("- Selection Sort: Time: "+ selectionSortTimeAverage + "ns Compare: "+ selectionSortCompareAverage + " Swap: "+ selectionSortSwapAverage);
        System.out.println("- Insertion Sort: Time: "+ insertionSortTimeAverage + "ns Compare: "+ insertionSortCompareAverage + " Swap: "+ insertionSortSwapAverage);
        System.out.println("- Bubble Sort: Time: "+ bubbleSortTimeAverage + "ns Compare: "+ bubbleSortCompareAverage + " Swap: "+ bubbleSortSwapAverage);
        System.out.println("- Java Sort: Time: "+ javaSortTimeAverage + "ns");

    }

    // Stabilität / In-Place
    public static int[] insertionSort(int[] list){
        int n = list.length;
        int compareCount = 0;
        int swapCount = 0;
        for(int k=1; k<n-1; k++)   {
            int temp = list[k];
            int j = k-1;
            while(j>=0 && temp <= list[j])   {
                list[j+1] = list[j];
                swapCount++;
                j--;
            }
            compareCount++;
            list[j+1] = temp;
        }

        // System.out.println("- Compare: " + compareCount);
        // System.out.println("- Swap: " + swapCount);

        return new int[]{compareCount, swapCount};
    }

    // In-Place
    public static int[] selectionSort(int[] arr) {
        int compareCount = 0;
        int swapCount = 0;

        for (int i = 0; i < arr.length - 1; i++)  {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        // System.out.println("- Compare: " + compareCount);
        // System.out.println("- Swap: " + swapCount);

        return new int[]{compareCount, swapCount};
    }

    // Stabilität / In-Place
    public static int[] bubbleSort(int[] arr) {
        int compareCount = 0;
        int swapCount = 0;

        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
                compareCount++;
            }

        // System.out.println("- Compare: " + compareCount);
        // System.out.println("- Swap: " + swapCount);

        return new int[]{compareCount, swapCount};
    }
}
