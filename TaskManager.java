package com.example.Employee;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    // This acts as our database of employees
    private List<Employee> employeeList;

    public TaskManager() {
        this.employeeList = new ArrayList<>();
    }

    // 1. Add Employee to the system
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
    }

    // 2. Fetch Employee by ID (Used to assign or modify tasks)
    public Employee findEmployeeById(int id) {
        for (Employee emp : employeeList) {
            if (emp.getEmpId() == id) {
                return emp;
            }
        }
        return null; // Return null if employee not found
    }

    // 3. Display Tasks Grouped by Employees
    public void displayAllGroupedTasks() {
        System.out.println("\n===== EMPLOYEE TASK REPORT =====");
        for (Employee emp : employeeList) {
            System.out.println("Employee: " + emp.getEmpName() + " (ID: " + emp.getEmpId() + ")");
            if (emp.getTasks().isEmpty()) {
                System.out.println("   - No tasks assigned.");
            } else {
                for (Task t : emp.getTasks()) {
                    System.out.println("   -> " + t);
                }
            }
            System.out.println("--------------------------------");
        }
    }

    // 4. Filter Tasks by Priority across all employees
    public void filterTasksByPriority(String priority) {
        System.out.println("\nSearching for [" + priority + "] priority tasks...");
        for (Employee emp : employeeList) {
            for (Task t : emp.getTasks()) {
                if (t.getPriority().equalsIgnoreCase(priority)) {
                    System.out.println("Found: " + t.getTaskDescription() + " (Assigned to: " + emp.getEmpName() + ")");
                }
            }
        }
    }
}