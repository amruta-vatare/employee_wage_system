package com.bridgeLabs;

public class Company {
    private static int EMP_WAGE_PER_HOUR;
    private static int DAYS_PER_MONTH;
    private static int TOTAL_WORKING_HOURS_PER_MONTH;

    private int empTotalWorkingHours;

    public int getEmpTotalWorkingHours() {
        return empTotalWorkingHours;
    }

    public void setEmpTotalWorkingHours(int empTotalWorkingHours) {
        this.empTotalWorkingHours = empTotalWorkingHours;
    }

    public int getEmpMonthlySalary() {
        return empMonthlySalary;
    }

    public void setEmpMonthlySalary(int empMonthlySalary) {
        this.empMonthlySalary = empMonthlySalary;
    }

    private int empMonthlySalary;

    public Company(int emp_wage_per_hour, int days_per_month, int total_working_hours_per_month) {
        EMP_WAGE_PER_HOUR = emp_wage_per_hour;
        DAYS_PER_MONTH = days_per_month;
        TOTAL_WORKING_HOURS_PER_MONTH = total_working_hours_per_month;
    }

    public static int getEmpWagePerHour() {
        return EMP_WAGE_PER_HOUR;
    }

    public static void setEmpWagePerHour(int empWagePerHour) {
        EMP_WAGE_PER_HOUR = empWagePerHour;
    }

    public static int getDaysPerMonth() {
        return DAYS_PER_MONTH;
    }

    public static void setDaysPerMonth(int daysPerMonth) {
        DAYS_PER_MONTH = daysPerMonth;
    }

    public static int getTotalWorkingHoursPerMonth() {
        return TOTAL_WORKING_HOURS_PER_MONTH;
    }

    public static void setTotalWorkingHoursPerMonth(int totalWorkingHoursPerMonth) {
        TOTAL_WORKING_HOURS_PER_MONTH = totalWorkingHoursPerMonth;
    }
}
