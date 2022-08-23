package com.bridgeLabs;

public class EmployeeWageUC3 {
    private static final int EMP_WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;
    public static void main(String[] args) {
        int empIsFullTime = 1;
        int empIsPartTime = 2;
        int salary = 0;

        double check =Math.floor(Math.random()*10)%3;

        if(empIsFullTime == check){
            salary = EMP_WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee is present full day!");
        }else if(empIsPartTime == check){
            salary = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Employee is present part time!");
        }else{
            salary = 0;
            System.out.println("Employee is absent!");
        }
        System.out.println("salary is "+salary);
    }
}
