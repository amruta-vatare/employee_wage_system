package com.bridgeLabs;

import java.sql.SQLOutput;

public class EmployeeWageUC2 {

    private static final int EMP_WAGE_PER_HOUR = 20;
    private static final int FULL_DAY = 8;
    public static void main(String[] args) {
        int empIsPresent = 1;
        Double check = Math.floor(Math.random()*10)%2;
        if(empIsPresent == check){
            int salary = EMP_WAGE_PER_HOUR * FULL_DAY;
            System.out.println("Salary is : "+salary);
        }else{
            System.out.println("Employee is absent salary is : 0");
        }
    }
}
