package test.Company;

import test.Employee.Employee;

import java.util.LinkedList;
import java.util.List;

public abstract class CompanyBase {
    public List<Employee> employees;
    public int DefaultFullDayWorkingHours = 10;
    public CompanyBase(){
        this.employees = new LinkedList<>();
    }
}
