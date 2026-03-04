package com.example.com;

import java.util.*;

public class Employee {
    private int id;
    private String name;
    private String address;
    private double salary;
    private List<Task> tasks=new ArrayList<Task>();

    public Employee(int id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public List<Task> getTasks() {
         return tasks;
     }

     public void addTask(Task task) {
         if (task != null) {
             tasks.add(task);
         }
     }

     public void addTasks(List<Task> tasks) {
         if (tasks != null) {
             this.tasks.addAll(tasks);
         }
     }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Employee)) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id;
//    }
//
//    @Override
//    public int hashCode() { return Objects.hash(id); }
//
//    @Override
//    public String toString() {
//        return "Employee{id=" + id + ", name='" + name + '\'' + '}';
//    }
}