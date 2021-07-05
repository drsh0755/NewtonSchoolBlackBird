package com.company;

public class BankTransaction {
    public static int balanceAfterTransaction(int currentBalance, int deductionAmount) throws CustomException{
        if(currentBalance>deductionAmount){
            currentBalance-=deductionAmount;
            return currentBalance;
        }else {
            throw new CustomException("Deduction Amount is greater than current amount");
        }

    }


}
