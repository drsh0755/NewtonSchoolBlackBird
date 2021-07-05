package com.company;

public class Factorial {
    public static void factorial(int N){
        int result=1;
        for(int i=1;i<=N;i++){
            result=result*i;
        }
        System.out.println(result);
    }
}
