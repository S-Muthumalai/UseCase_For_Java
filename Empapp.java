package com.example.Employee;

public class Empapp {
    public static void main(String[] args) {
        // 1. Initialize the TaskManager (Our Engine)
        TaskManager manager = new TaskManager();

        // 2. Create Employees
        Employee emp1 = new Employee(101,"Muthumalai");
        Employee emp2 = new Employee(102,"paul zion");

        // 3. Register Employees into the system
        manager.addEmployee(emp1);
        manager.addEmployee(emp2);

        // 4. Create some Tasks
        Task t1 = new Task("T001", "Develop Login Module", "High");
        Task t2 = new Task("T002", "Fix UI Bugs", "Medium");
        Task t3 = new Task("T003", "Database Migration", "High");
        
        // This is a duplicate of t1 (Same ID)
        Task t1_duplicate = new Task("T001", "Develop Login Module (Again)", "Low");

        // 5. Assign Tasks to Paul
        System.out.println("--- Assigning Tasks to Paul ---");
        emp1.addTask(t1);
        emp1.addTask(t2);
        
        // Testing Duplicate Prevention:
        // Because of the equals() and hashCode() you wrote in Task.java, 
        // this should be rejected by the LinkedHashSet in Employee.java.
        emp1.addTask(t1_duplicate); 

        // 6. Assign Task to Muthu
        System.out.println("\n--- Assigning Tasks to Sanjay ---");
        emp2.addTask(t3);

        // 7. Display Tasks Grouped by Employees
        manager.displayAllGroupedTasks();

        // 8. Filter Logic: Show only High Priority tasks
        manager.filterTasksByPriority("High");
    }
}