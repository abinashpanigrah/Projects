package com.employee.services;

import java.util.List;

import com.employee.entities.Employee;

public interface EmployeeService 
{
   public void saveEmployee(Employee employee);
   
   public List<Employee> getAllEmployees();
   
   public Employee getOneEmployeeById(long id);
   
   public void deleteEmployee(long id);
	
	
}
