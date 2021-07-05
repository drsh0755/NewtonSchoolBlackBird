package com.company;

import java.sql.SQLOutput;

public class conditionalStatements {
    public static void printDayOfWeek(int N)

    {
        if (N == 1) {
            System.out.println("Monday");
        } else if (N == 2){
            System.out.println("Tuesday");
        }else if(N==3){
            System.out.println("Wednesday");
        }else if(N==4){
            System.out.println("Thursday");
        }else if(N==5){
            System.out.println("Friday");
        }else if(N==6 || N==7){
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid Input");
        }
    }

    public static void gradeOfAStudent(float N){
        if(N>90){
            System.out.println("Grade A");
        }else if(N>80 && N<=90){
            System.out.println("Grade B");
        }else if(N>70 && N<=80){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
    }

    public static void printDayOfWeekUsingSwitchCase(int N){
        switch (N){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static void printPattern(int N){
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printPatternUsingWhileLoop(int N){
        int i=1;
        while(i<=N){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void printPattern1(int row){
        int i, j;
        for (i=0; i<row; i++)
        {
            for (j=row-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
