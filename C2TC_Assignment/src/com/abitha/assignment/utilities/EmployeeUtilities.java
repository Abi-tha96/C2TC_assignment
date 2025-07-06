package com.abitha.assignment.utilities;
import com.abitha.assignment.employees.*;

public class EmployeeUtilities {
	 public static void displayEmployeeInfo(Employee emp) {
	        System.out.println("Name: " + emp.getName());
	        System.out.println("Employee ID: " + emp.getEmployeeId());
	        System.out.println("Salary: " + emp.getSalary());

	        if (emp instanceof Manager) {
	            System.out.println("Team Size: " + ((Manager) emp).getTeamsize());
	        } else if (emp instanceof Developer) {
	            System.out.println("Programming Language: " + ((Developer) emp).getProgrammer());
	        }

	        System.out.println("---------------------------------");
	    }

	    public static void increaseSalary(Employee emp, double amount) {
	        emp.setSalary(emp.getSalary() + amount);
	        System.out.println(emp.getName() + "'s salary increased by " + amount);
			
		}

}
