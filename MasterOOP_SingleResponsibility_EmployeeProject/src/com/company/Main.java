package com.company;

import com.company.Client.ClientModule;
import com.company.Domain.Employee;

public class Main {

    public static void main(String[] args) {

        Employee adella = new Employee(1, "Adella", "IT", true);
        ClientModule.hireNewEmployee(adella);

        ClientModule.printEmployeeReport(adella);
    }
}
