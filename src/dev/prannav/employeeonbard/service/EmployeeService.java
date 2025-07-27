package dev.prannav.employeeonbard.service;
import dev.prannav.employeeonbard.employee.Employee;

public class EmployeeService
{
    public void onBoardingEmployee(Employee emp)
    {
        System.out.println("Employee onboarding process started....");
        emp.showInfo();
        System.out.println("Employee onboarding process completed....");
    }
}
