package com.example.com;
import java.util.*;

public class Company {
	public List<Employee> addemployee(){
		List<Employee> e=new ArrayList<>();
		e.add(new Employee(1,"Muthumalai","chennai",100000));
		e.add(new Employee(2,"Muthu","chennai",100000));
		e.add(new Employee(3,"MuthuRaj","chennai",100000));
		e.add(new Employee(4,"MuthuKumar","chennai",100000));
		e.add(new Employee(5,"RAJ","chennai",100000));
		e.add(new Employee(6,"Kumar","chennai",100000));
		e.add(new Employee(7,"Kandhasami","chennai",100000));
		return e;
	}
      public void assignTasksToEachEmployee(List<Employee> employees) {
        for (Employee emp : employees) {
            emp.addTask(new Task(1,"Onboard " + emp.getName()));
            System.out.println(new Task(1,"onboard"+emp.getName()));
            emp.addTask(new Task(2,"Create report for " + emp.getName()));
            emp.addTask(new Task(3,"Code review for " + emp.getName()));
        }
    }

	public void FetchAll(List<Employee> e) {
		Iterator<Employee> it= e.iterator();
		while(it.hasNext()) {
			Employee p =(Employee)it.next();
			System.out.println(p.getId()+")"+p.getName()+"\nAddress -->"+p.getAddress()+"\nSalay -->"+p.getSalary()+"\n");

if (p.getTasks().isEmpty()) {
                System.out.println(" ::: Tasks = [No Tasks]");
            } else {
                System.out.print(" ::: Tasks = [");
                for (int i = 0; i < p.getTasks().size(); i++) {
                    System.out.print(p.getTasks().get(i).getTaskName());
                    if (i < p.getTasks().size() - 1) System.out.print(", ");
                }
                System.out.println("]");
            }

		}
	}
	
public static void main(String args[]) {
	Company c=new Company();
	List <Employee> e=c.addemployee();
	c.assignTasksToEachEmployee(e);
	c.FetchAll(e);
	
	
}
}
