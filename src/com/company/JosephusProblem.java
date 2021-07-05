package com.company;

public class JosephusProblem {
    public static int josephus(int N,int K){
        if(N==1){
            return 1;
        }else{
            return (josephus(N-1,K)+K-1)%N+1;
        }
    }
}
