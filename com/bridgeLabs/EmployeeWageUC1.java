package com.bridgeLabs;

public class EmployeeWageUC1 {
    public static void main(String[] args) {
        int empIsPresent = 1;
        double checkEmp = Math.floor(Math.random()*10)%2;
        if( empIsPresent == checkEmp){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }
}
