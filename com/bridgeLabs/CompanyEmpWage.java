package com.bridgeLabs;

public class CompanyEmpWage {
    private int id;
    private int companyEmpWage;

    public CompanyEmpWage(int id, int companyEmpWage) {
        this.id = id;
        this.companyEmpWage = companyEmpWage;
    }
    public String getCompanyWage(){
        return "Id : "+id+" Company Employee Wage : "+companyEmpWage;
    }


}
