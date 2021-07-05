package com.company;

public class FibonacciSeries {
    public static void fibonacciSeries(int N){
        int firstTerm=0;
        int secondTerm=1;
        if(N==1){
            System.out.print(firstTerm + " ");
        }
        if(N>=2){
            System.out.print(firstTerm + " " + secondTerm + " ");
            for(int i=3;i<=N;i++){
                int newTerm=firstTerm+secondTerm;
                System.out.print(newTerm+ " ");
                firstTerm=secondTerm;
                secondTerm=newTerm;
            }
        }
    }
}
