package com.example.Employee;

import java.util.Objects;

public class Task {
	public String taskId;
	public String taskDescription;
	public String priority;
	
	public Task(String taskId, String taskDescription, String priority) {
		this.taskId = taskId;
		this.taskDescription = taskDescription;
		this.priority = priority;
	}
	
	public String getTaskId() { return taskId; }
	public String getTaskDescription() { return taskDescription; }
	public String getPriority() { return priority; }
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	
	@Override
	public String toString() {
		return "[" + taskId + "]" + taskDescription + "(Priority: " + priority + ")"; 
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskId, task.taskId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }
}


