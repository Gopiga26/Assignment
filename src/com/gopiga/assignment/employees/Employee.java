package com.gopiga.assignment.employees;

public class Employee {
    private String name;
    private String employeeId;  // Changed to String
    private double salary;

    // Constructor
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {  // Changed to String return type
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {  // Changed to String parameter
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


