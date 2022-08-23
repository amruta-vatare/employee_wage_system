package com.bridgeLabs;

public class EmployeeWageUC7 {
    private static final int EMP_WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;
    private static final int EMP_IS_FULL_TIME = 1;
    private static final int EMP_IS_PART_TIME = 2;
    private static final int DAYS_PER_MONTH = 20;
    private static final int TOTAL_WORKING_HOURS_PER_MONTH = 100;
    private static int empWorkingHoursPerMonth = 0;
    private static int empWorkingDays = 1 ;
    private static int monthlySalary = 0;
    public static void main(String[] args) {
        int salary = 0;
        while(empWorkingDays<DAYS_PER_MONTH && empWorkingHoursPerMonth != TOTAL_WORKING_HOURS_PER_MONTH){
            int check = (int) Math.floor(Math.random()*10)%3;
            switch (check){
                case EMP_IS_FULL_TIME:
                    System.out.println("Employee is present full day!");
                    salary = computeEmpWage(FULL_DAY_HOUR);
                    empWorkingHoursPerMonth += FULL_DAY_HOUR;
                    empWorkingDays++;
                    monthlySalary += salary;
                    break;
                case EMP_IS_PART_TIME:
                    System.out.println("Employee is present part time!");
                    salary = computeEmpWage(PART_TIME_HOUR);
                    empWorkingHoursPerMonth += PART_TIME_HOUR;
                    empWorkingDays++;
                    monthlySalary += salary;
                    break;
                default:
                    salary = computeEmpWage(0);
                    empWorkingHoursPerMonth += 0;
                    empWorkingDays++;
                    monthlySalary += salary;
                    System.out.println("Employee is absent!");
                    break;
            }
            System.out.println("Day "+empWorkingDays+" salary is "+salary);
            System.out.println("------------------------------------------");
        }

        System.out.println("Employee Total working hours in month is "+empWorkingHoursPerMonth);
        System.out.println("Employee has monthly salary is : "+monthlySalary);
    }

    private static int computeEmpWage(int dayHour) {
        if(dayHour == 0)
            return 0;
        return EMP_WAGE_PER_HOUR * dayHour;
    }
}
