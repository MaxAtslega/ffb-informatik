package de.atslega.chapter03.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Search {
    public static void main(String[] args) {

        int[] randomArray = IntStream.range(100, 1_000_000_000).toArray();

        long start1 = System.nanoTime();

        int x = binarySearchRecursive(randomArray, 99_999_998, randomArray.length-1, 0);

        long end1 = System.nanoTime();

        long start2 = System.nanoTime();

        int x2 = binarySearch(randomArray, 99_999_998);

        long end2 = System.nanoTime();

        long start3 = System.nanoTime();

        int x3 = Arrays.binarySearch(randomArray, 99_999_998);

        long end3 = System.nanoTime();

        System.out.println("RBS hat " + (end1 - start1) + " ns"+ " und BS hat " + (end2 - start2) + " ns" + " und JBS hat " + (end3-start3) + "ns" + " und ist bei Position: "+x+ " | "+x2+ " | "+ x3);
    }


    public static int linearSearch(int[] list, int search){
        int i = 0;
        while (i < list.length){
            if (list[i] == search){
                return i;
            }
            i++;
        }

        return -1;
    }
    public static int binarySearch(int[] list, int search){
        int left = 0;
        int right = list.length-1;
        while (left <= right){
            int middle = left + (right - left)/2;

            if (list[middle] == search) return middle;
            if (list[middle] < search) left = middle + 1;
            else right = middle - 1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] list, int search, int right, int left) {
        int middle = left + (right - left) / 2;

        if (right <= left) return -1;
        if (list[middle] == search) return middle;
        if (list[middle] < search) return binarySearchRecursive(list, search, right, middle + 1);
        return binarySearchRecursive(list, search, middle-1, left);
    }
}
