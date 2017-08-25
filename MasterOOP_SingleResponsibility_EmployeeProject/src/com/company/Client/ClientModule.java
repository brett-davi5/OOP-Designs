package com.company.Client;

import com.company.Database.EmployeeDAO;
import com.company.Domain.Employee;
import com.company.Reports.EmployeeReportFormatter;
import com.company.Reports.FormatType;

public class ClientModule {

    public static void hireNewEmployee(Employee emp){
        EmployeeDAO alphaDAO = new EmployeeDAO();
        alphaDAO.saveEmployee(emp);

    }

    public static void terminateEmployee(Employee emp){
        EmployeeDAO alphaDAO = new EmployeeDAO();
        alphaDAO.deleteEmployee(emp);
    }

    public static void printEmployeeReport(Employee emp){
        EmployeeReportFormatter alphaReportFormatter = new EmployeeReportFormatter(emp, FormatType.XML);
        alphaReportFormatter.getFormattedEmployee();
    }

}
