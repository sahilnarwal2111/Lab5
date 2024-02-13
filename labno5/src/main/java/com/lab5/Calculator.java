package com.lab5;

import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);
    public float getSalary(){
        float salary = sc.nextFloat();
        return salary;
    }
    public float getSales(){
        float sales = sc.nextFloat();
        return sales;
    }

    public float calculator(float salary, float sales){
        float commission = 0;
        if(sales > 5000){
            commission = (sales - 5000) * 12;
        }
        return salary + commission;
    }
}
