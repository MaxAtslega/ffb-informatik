package de.atslega.chapter03.sort;

import java.util.Arrays;
import java.util.Random;

public class Sort {

    public static void main(String[] args) {
        for (int i = 1; i <= 400; i++) {
            int[] randomArray = new Random().ints(100*i, 0, 100*i).toArray();

            long start1 = System.nanoTime();
            insertionSort(randomArray);
            long end1 = System.nanoTime();

            int[] randomArray2 = new Random().ints(100*i, 0, 100*i).toArray();

            long start2 = System.nanoTime();
            selectionSort(randomArray2);
            long end2 = System.nanoTime();

            int[] randomArray3 = new Random().ints(100*i, 0, 100*i).toArray();

            long start3 = System.nanoTime();
            Arrays.sort(randomArray3);
            long end3 = System.nanoTime();



            System.out.println((end1-start1) + "," + (end2-start2) + "," + (end3-start3) + "," + 100*i);
        }

        /*for (int number:
                newArray) {
            System.out.println(number);
        }*/
    }


    // Stabilität / In-Place
    public static void insertionSort(int[] list){
        int n = list.length;

        for(int k=1; k<n-1; k++)   {
            int temp = list[k];
            int j = k-1;
            while(j>=0 && temp <= list[j])   {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
        }
    }

    // In-Place
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

    // Stabilität / In-Place
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
