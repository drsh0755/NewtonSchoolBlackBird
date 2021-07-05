package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {
    public static boolean isPrime(int N){
        if(N<2){
            //System.out.println("No");
            return false;
        }
        if(N==2){
            //System.out.println("Yes");
            return true;
        }
        for(int i=2;i<=(int)Math.sqrt(N);i++){
            if(N%i==0){
                //System.out.println("No");
                return false;
            }
        }
        //System.out.println("Yes");
        return true;
    }
    public static void printFactors(int N){
        for(int i=1;i*i<N;i++){
            if(N%i==0){
                if(N/i!=i){
                    System.out.print(i + " " + N/i);
                }else{
                    System.out.print(i + " ");
                }
            }
        }

    }
    public static void primeUptoN(int N){
        int count=0;
        for(int i=1;i<=N;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static ArrayList<Integer> SieveofEratosthenes(int N){
        boolean IsPrime[]=new boolean[N+1];
            Arrays.fill(IsPrime,true);
            IsPrime[0]=false;
            IsPrime[1]=false;
            for(int i=1;i<=N;i++){
                if(IsPrime[i]){
                    for(int j=i*i;j<=N;j+=i){
                        IsPrime[j]=false;
                    }
                }
            }
        ArrayList<Integer> primeList=new ArrayList<Integer>();
            for(int i=2;i<=N;i++){
                if(IsPrime[i]){
                    primeList.add(i);
                    //System.out.print(i + " ");
                }
            }
            return primeList;
    }

    public static int segmentedSieveofEratosthenes(int N){
        int count=0;
        if(N>=2){
            int limit=(int)Math.sqrt(N);
            ArrayList<Integer> primes=SieveofEratosthenes(limit);
            count=primes.size();
            int low=limit;
            int high=2*limit;
            while(low<N){
                if(high>=N){
                    high=N;
                }
                boolean mark[]=new boolean[limit+1];
                Arrays.fill(mark,true);
                for(int i=0;i<primes.size();i++){
                    int smallest=low/primes.get(i)*primes.get(i);
                    if(smallest<low){
                        smallest=smallest+primes.get(i);
                    }
                    for(int j=smallest;j<=high;j=j+ primes.get(i)){
                        mark[j-low]=false;
                    }

                }
                for(int i=low;i<=high;i++){
                    if(mark[i-low]){
                        count++;
                    }
                }
                low=low+limit;
                high=high+limit;
            }
        }
        return count;
    }
    public static void printPrimeFactors(int N){
        if(N>1){
            for(int i=2;i<=N;i++){
                if(N%i==0){
                    System.out.print(i + " ");
                    while (N%i==0){
                        N=N/i;
                    }
                }
            }
        }
    }

    public static void printPrimeFactorization(int N){
        if(N>1){
            for(int i=2;i<=N;i++){
                if(N%i==0){
                    System.out.print(i+"*");
                    while (N%i==0){
                        System.out.print(i+"*");
                        N=N/i;
                    }
                }
            }
        }
    }
}

