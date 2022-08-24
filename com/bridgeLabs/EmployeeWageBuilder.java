package com.bridgeLabs;

import java.util.ArrayList;

public class EmployeeWageBuilder {
    private int companyId ;
    private int CompanyEmpWage;

    ArrayList<CompanyEmpWage> C_EmpWage = new ArrayList<>();

    public int CalculateEmpWage(int wage_per_hours,int total_working_hours,Company company){
        this.companyId = company.getCompanyID();
        CompanyEmpWage = wage_per_hours * total_working_hours;
        C_EmpWage.add(new CompanyEmpWage(companyId,CompanyEmpWage));
        return CompanyEmpWage;
    }
}
