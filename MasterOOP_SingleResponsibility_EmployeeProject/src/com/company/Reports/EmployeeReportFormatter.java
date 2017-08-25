package com.company.Reports;

import com.company.Domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
    //FormatType formatType;


    public EmployeeReportFormatter(Employee anEmployee, FormatType formatType) {
        super(anEmployee, formatType);
    }

    public void getFormattedEmployee(){
        System.out.println("Getting formatted employee...");
    }
}
