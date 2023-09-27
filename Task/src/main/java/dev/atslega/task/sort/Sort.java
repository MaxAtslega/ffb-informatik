package dev.atslega.task.sort;

import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 2, 1};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

   public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i-1;

            while(j>= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = temp;
        }
   }

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++){
            boolean swaped = false;
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                    swaped = true;
                }
            }

            if (!swaped) break;
        }
    }

   public static void quickSort(int[] array, int start, int end){
        if (start >= end) return;

        int pivotPosition = partition(array, start, end);
        quickSort(array, pivotPosition + 1, end);
        quickSort(array, start, pivotPosition - 1);
   }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];

        int i = start-1;
        for (int j = start; j < end; j++){
            if (array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j]  = temp;
            }
        }

        int temp = array[end];
        array[end] = array[i+1];
        array[i+1]  = temp;

        return i+1;
    }

    public static void selectionSort(int[] arr) {
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
    }

}
