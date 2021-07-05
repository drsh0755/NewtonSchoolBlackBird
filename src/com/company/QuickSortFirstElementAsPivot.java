package com.company;

public class QuickSortFirstElementAsPivot {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;

        for(int j = low + 1; j <= high; j++) {
            if(arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        return i;
    }

    public static void quickSort(int arr[], int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}
