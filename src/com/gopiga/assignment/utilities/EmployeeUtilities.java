package com.gopiga.assignment.utilities;

import com.gopiga.assignment.employees.Employee;
import com.gopiga.assignment.employees.Manager;
import com.gopiga.assignment.employees.Developer;

public class EmployeeUtilities {

    public void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());

        // Handle Manager-specific details
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Department: " + manager.getDepartment());
        } 
        // Handle Developer-specific details
        else if (employee instanceof Developer) {
            Developer developer = (Developer) employee;
            System.out.println("Programming Language: " + developer.getProgrammingLanguage());
        }
    }
}
