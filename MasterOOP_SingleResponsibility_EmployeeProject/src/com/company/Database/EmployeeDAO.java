package com.company.Database;

import com.company.Domain.Employee;

public class EmployeeDAO {


    public void saveEmployee(Employee emp){

        DatabaseConnectionManager connectionManager = new DatabaseConnectionManager();
        connectionManager.getManagerInstance();
        connectionManager.connect();
        connectionManager.getConnectionObject();

        System.out.println("Saving employee: " + emp);
    }

    public void deleteEmployee(Employee emp){
        System.out.println("Deleting employee: " + emp);
    }

}
