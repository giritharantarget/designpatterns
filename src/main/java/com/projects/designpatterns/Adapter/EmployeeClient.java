package com.projects.designpatterns.Adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {


    public void getEmployeesList(){

        List<Employee> employees = new ArrayList<>();

        Employee employeeDB = new EmployeeDB("12","John","Peters", "John.Perters@xyz.com");

        employees.add(employeeDB);

        // Legacy code which gets employee details from LDAP

        EmployeeLdap employeeLdap = new EmployeeLdap("1256","Mark", "Supluck","Mark.Supluck@xyz.com");

        employees.add(new EmployeeLDAPAdapter(employeeLdap));

        System.out.println(employees.toString());



    }
}
