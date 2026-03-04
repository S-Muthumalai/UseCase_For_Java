
package com.example.com;

public class Task {
    private String taskName;
    private int taskId;
    public Task(int taskId,String taskName) {
        this.taskName = taskName;
        this.taskId=taskId;
    }
    public int getTaskId() {
    	return taskId;
    }
    public String getTaskName() {
        return taskName;
    }
}
