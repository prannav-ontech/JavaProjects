package dev.prannav.employeeonbard.employee;

public class Employee
{
 String name;
 String id;

 public Employee(String name, String id)
 {
	 this.name = name;
	 this.id = id;
 }
 public String toString()
 {
	 return "Employee Name: "+name+ " \nEmployee Id: "+id;
 }
 public void showInfo()
 {
	 System.out.println(toString());
 }
}
