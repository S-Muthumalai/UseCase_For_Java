package com.example.Employee;

import java.util.Set;

public class Employee {
	private int empId;
	private String empName;
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	private Set<Task> tasks;
	


public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

public void addTask(Task task) {
if(tasks.add(task)) {
	System.out.println("Task " + task.getTaskId() + "'assigned to'" + empName);
} else {
	System.out.println("'Duplicate Task! '" + task.getTaskId()+ "' is already assigned to " + empName);
}
}

public int getEmpId() { return  empId; 
}
public String getEmpName() { return empName;
}
public Set <Task> getTasks() { return tasks;
}
@Override 
public String toString() {
	return "ID: " + empId + "| Name: " + empName + " | Tasks: " + tasks.size();
}
}
