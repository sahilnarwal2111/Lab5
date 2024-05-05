package com.lab5;
import java.util.Scanner;
public class Calculator {
    Scanner sc = new Scanner(System.in);
    int numberOfCalls;

    public int getNumberOfCall(){
        numberOfCalls = sc.nextInt();
        return numberOfCalls;
    }
    public void setNumberOfCalls(int calls){
        numberOfCalls = calls;
    }
    public double calculateBill(int numberOfCalls){
        if(numberOfCalls <= 300){
            return 500;
        }
        double amount = 500;
        if(numberOfCalls <= 365){
            int extra = numberOfCalls - 300;
            amount += extra * 0.95;
            return amount;
        }
        if(numberOfCalls <= 455){
            int extra = numberOfCalls - 365;
            amount += 65 * 0.95 + extra * 1.5;
            return amount;
        }
        if(numberOfCalls > 455){
            int extra = numberOfCalls - 455;
            amount += 65*0.95 + 1.5*90 + extra * 2.25;
            return amount;
        }
        return amount;
    }
}