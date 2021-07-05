package com.company;

public class GCD {
    public static int iterativeGCD(int N,int M){
        int rem=1;
        while(M!=0){
            rem=N%M;
            N=M;
            M=rem;
        }
        //System.out.println(N);
        return N;
    }
    public static void arrayGCD(int arr[]){
        int len=arr.length;
        int gcd=arr[0];
        for(int i=1;i<len;i++){
            gcd=iterativeGCD(gcd,arr[i]);
            if(gcd==1){
                break;
            }
        }
        System.out.println(gcd);
    }
}
