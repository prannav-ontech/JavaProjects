package dev.prannav.employeeonbard;
import dev.prannav.employeeonbard.employee.Employee;
import dev.prannav.employeeonbard.service.EmployeeService;

public class MainApp {
    public static void main(String[] args) {
        Employee emp= new Employee("Pranav","123456");
        EmployeeService empS = new EmployeeService();
        empS.onBoardingEmployee(emp);
    }
}
