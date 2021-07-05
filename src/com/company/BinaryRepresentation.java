package com.company;

import java.util.ArrayList;

public class BinaryRepresentation {
    public static void representationBinary(int N){
        if(N>0){
            ArrayList<Integer> rep =new ArrayList<Integer>();
            while (N!=0){
                rep.add(N%2);
                N=N/2;
            }
            for(int i=rep.size()-1;i>=0;i--){
                System.out.print(rep.get(i));
            }
        }
    }
}
