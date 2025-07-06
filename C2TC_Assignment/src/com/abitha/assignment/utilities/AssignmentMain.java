package com.abitha.assignment.utilities;
import com.abitha.assignment.employees.*;

public class AssignmentMain {
	public static void main(String[] args) {
		Manager manager = new Manager("Abitha", 101, 90000, 5);
        Developer developer = new Developer("Suvitha", 102, 80000, "Java");

        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.displayEmployeeInfo(developer);

        EmployeeUtilities.increaseSalary(manager, 5000);
        EmployeeUtilities.increaseSalary(developer, 3000);

        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.displayEmployeeInfo(developer);
    }
}

