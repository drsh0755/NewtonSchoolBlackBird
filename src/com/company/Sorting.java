package com.company;

public class Sorting {
    public static void bubbleSort(int arr[],int N){
        boolean isSwapped=false;
        for(int i=0;i<N;i++){
            for(int j=0;j<N-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
                if(isSwapped==false){
                    break;
                }
            }
        }
    }

    public static void insertionSort(int arr[],int N){
        for(int i=1;i<N;i++){
            int currentElement=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>currentElement){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentElement;
        }

    }

    public static void selectionSort(int arr[],int N){
        for(int i=0;i<N-1;i++){
            int minIndex=i;
            for(int j=i+1;j<N;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
    }
}
