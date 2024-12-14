package com.gopiga.assignment;

import com.gopiga.assignment.employees.Manager;
import com.gopiga.assignment.employees.Developer;
import com.gopiga.assignment.utilities.EmployeeUtilities;

public class Assignmentmain {
    
    public static void main(String[] args) {

        // Create Manager and Developer objects
        Manager manager = new Manager("Gopiga", "01", 75000, "IT");
        Developer developer = new Developer("Sri", "02", 60000, "Java");

        // Create EmployeeUtilities instance to print details
        EmployeeUtilities utilities = new EmployeeUtilities();

        // Display Manager details
        System.out.println("Manager Details:");
        utilities.printEmployeeDetails(manager);

        // Display Developer details
        System.out.println("\nDeveloper Details:");
        utilities.printEmployeeDetails(developer);
    }
}
