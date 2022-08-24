package com.bridgeLabs;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWageUC10 {
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;
    private static final int EMP_IS_FULL_TIME = 1;
    private static final int EMP_IS_PART_TIME = 2;
    private static Scanner sc ;
    private static EmployeeWageBuilder C_wage_cal = new EmployeeWageBuilder();

    public static void main(String[] args) {

        int EMP_WAGE_PER_HOUR;
        int DAYS_PER_MONTH;
        int TOTAL_WORKING_HOURS_PER_MONTH;
        int EmpTotalWage_C;
        CompanyEmpWage companyEmpWage=null;

        sc = new Scanner(System.in);
        System.out.println("How many companies employee wage you want to calculate");
        int c = sc.nextInt();
        for(int i = 1 ;i <= c;i++){


            Company company = setCompany();
            EMP_WAGE_PER_HOUR =company.getEmpWagePerHour();
            DAYS_PER_MONTH = company.getDaysPerMonth();
            TOTAL_WORKING_HOURS_PER_MONTH = company.getTotalWorkingHoursPerMonth();


            int empWorkingDays = 0 ;
            int empWorkingHoursPerMonth = 0;
            int salary = 0;

            while(empWorkingDays<DAYS_PER_MONTH && empWorkingHoursPerMonth != TOTAL_WORKING_HOURS_PER_MONTH){
                int check = (int) Math.floor(Math.random()*10)%3;
                switch (check){
                    case EMP_IS_FULL_TIME:
                        System.out.println("Employee is present full day!");
                        salary = computeEmpWage(FULL_DAY_HOUR,EMP_WAGE_PER_HOUR);
                        empWorkingHoursPerMonth += FULL_DAY_HOUR;
                        empWorkingDays++;
                        break;
                    case EMP_IS_PART_TIME:
                        System.out.println("Employee is present part time!");
                        salary = computeEmpWage(PART_TIME_HOUR,EMP_WAGE_PER_HOUR);
                        empWorkingHoursPerMonth += PART_TIME_HOUR;
                        empWorkingDays++;
                        break;
                    default:
                        salary = computeEmpWage(0,EMP_WAGE_PER_HOUR);
                        empWorkingHoursPerMonth += 0;
                        empWorkingDays++;
                        System.out.println("Employee is absent!");
                        break;
                }
                System.out.println("Day "+empWorkingDays+" salary is "+salary);
                System.out.println("------------------------------------------");
            }


            EmpTotalWage_C = C_wage_cal.CalculateEmpWage(empWorkingHoursPerMonth,EMP_WAGE_PER_HOUR,company);
            company.setEmpTotalWage(EmpTotalWage_C);
            company.setEmpTotalWorkingHours(empWorkingHoursPerMonth);

            System.out.println("Company "+i+" Employee Total working hours in month is "+company.getEmpTotalWorkingHours());
            System.out.println("Company "+i+" Employee has monthly salary is : "+company.getEmpTotalWage());
            System.out.println("--------------------------------------------------------------------------");
        }

        ArrayList<CompanyEmpWage> list = C_wage_cal.C_EmpWage;
        for(CompanyEmpWage l :list){
            System.out.println(l.getCompanyWage());
        }
        System.out.println("See you again!!");

    }

    private static int EmpWageBuilder(int empWorkingHoursPerMonth, int emp_wage_per_hour)
    {
        return  emp_wage_per_hour *empWorkingHoursPerMonth;
    }

    private static Company setCompany() {
        sc = new Scanner(System.in);
        System.out.println("Enter the wage per day");
        int wagePerDay = sc.nextInt();
        System.out.println("Enter the Working hours per months");
        int workingHoursPerMonth = sc.nextInt();
        System.out.println("Enter the days per month");
        int daysPerMonth = sc.nextInt();
        Company company = new Company(wagePerDay,daysPerMonth,workingHoursPerMonth);
        return company;
    }

    private static int computeEmpWage(int dayHour,int empWage) {
        if(dayHour == 0)
            return 0;
        return empWage * dayHour;
    }
}
