package dev.atslega.task.sort;

public class Sort2 {

    public static void main(String[] args) {

    }

    // In-Place / Stabil O(n^2)


    // In-Place / Stabil O(n^2)
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i-1;

            while (j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = temp;
        }
    }

    // In-Place / Nicht Stabil O(n^2)
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length-1; i++){

        }
    }

    public static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swaped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swaped = true;
                }
            }

            if (!swaped) break;
        }
    }

    public static void insertionSort(int[] list){
        for(int k=1; k<list.length; k++)   {
            int temp = list[k];
            int j = k-1;
            while(j>=0 && temp < list[j])   {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
        }
    }
}
