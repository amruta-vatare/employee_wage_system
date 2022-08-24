package com.bridgeLabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmployeeWageBuilder1 implements CompanyEmpWage1{

    private int companyId ;
    private int companyEmpWage;

    Map<Integer,Integer> C_EmpWage = new HashMap<>();
    @Override
    public int calculateEmpWage(int wage_per_hours,int total_working_hours,Company company) {
        this.companyId = company.getCompanyID();
        companyEmpWage = wage_per_hours * total_working_hours;
        C_EmpWage.put(companyId,companyEmpWage);
        return companyEmpWage;
    }

    @Override
    public void companyEmpWage(int id, int companyEmpWage) {
            this.companyId = id;
            this.companyEmpWage = companyEmpWage;
    }
}
