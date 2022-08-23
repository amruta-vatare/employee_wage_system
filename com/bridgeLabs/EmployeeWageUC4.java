package com.bridgeLabs;

public class EmployeeWageUC4 {
    private static final int EMP_WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;
    private static final int EMP_IS_FULL_TIME = 1;
    private static final int EMP_IS_PART_TIME = 2;
    public static void main(String[] args) {
        int salary = 0;
        int check = (int) Math.floor(Math.random()*10)%3;
        switch (check){
            case EMP_IS_FULL_TIME:
                System.out.println("Employee is present full day!");
                salary = EMP_WAGE_PER_HOUR * FULL_DAY_HOUR;
            break;
            case EMP_IS_PART_TIME:
                System.out.println("Employee is present part time!");
                salary = EMP_WAGE_PER_HOUR * PART_TIME_HOUR;
                break;
            default:
                salary = 0;
                System.out.println("Employee is absent!");
                break;
        }
        System.out.println("salary is "+salary);
    }
}
