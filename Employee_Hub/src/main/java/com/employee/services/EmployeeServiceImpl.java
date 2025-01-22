package com.employee.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.Employee;
import com.employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	   @Autowired
	   private EmployeeRepository employeeRepository;
	

	   public void saveEmployee(Employee employee)
	   {
			employeeRepository.save(employee);
	   }
	   
	   public List<Employee> getAllEmployees()
	   {
		   List<Employee> employee = employeeRepository.findAll();		  
		   return employee;
	   }
	   
	   public Employee getOneEmployeeById(long id)
	   {
		   Optional<Employee> findbyid = employeeRepository.findById(id);
		    if (findbyid.isPresent()) {
		        return findbyid.get();
		    } else {
		        throw new RuntimeException("Employee not found with ID: " + id);
		    }
	   }
	   
	   public void deleteEmployee(long id)
	   {
		   employeeRepository.deleteById(id);
	   }
	
}
