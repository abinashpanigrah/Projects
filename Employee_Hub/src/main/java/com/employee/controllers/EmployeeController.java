package com.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
import com.employee.entities.Employee;
import com.employee.services.EmployeeService;

@Controller
public class EmployeeController 
{
    @Autowired
	private EmployeeService employeeService;
	
    @RequestMapping("/addEmployee") 
    public String viewInsertEmployeePage() 
    {
        return "Employee_Form"; 
    }
    
    @RequestMapping("/saveEmployee")
    public String saveOneLead(@ModelAttribute("employee") Employee employee, ModelMap model) 
    {
    	employeeService.saveEmployee(employee);
	    model.addAttribute("msg", "Employee Saved Successfully");
	    return "Employee_Form";
    }
    
    @RequestMapping("/listAll")
    public String listAllEmployees(ModelMap model) 
    {
	    List<Employee> Employees = employeeService.getAllEmployees();
	    model.addAttribute("emp", Employees);
	    return "Employee_list";
    }     
    
    @RequestMapping("/delete")
    public String deleteOneEmployee(@RequestParam ("id") long id, ModelMap model) 
    {
    	employeeService.deleteEmployee(id);
	    List<Employee> Employees = employeeService.getAllEmployees();
	    model.addAttribute("emp", Employees);
	    return "Employee_list"; 
    }
    
    
    @RequestMapping("/update")
    public String updateOneEmployee(@RequestParam ("id") long id, ModelMap model) 
    {
	    Employee employee = employeeService.getOneEmployeeById(id);
	    model.addAttribute("employeeUpd", employee);
	    return "UpdateEmployee";
    }
    
    
    @RequestMapping("/updateEmployee")
	public String updateOneEmployeeData(@ModelAttribute("employee") Employee employee, ModelMap model) 
    {   	
        employee.setFirstName(employee.getFirstName());
        employee.setLastName(employee.getLastName());
        employee.setGender(employee.getGender());
        employee.setDateOfBirth(employee.getDateOfBirth());
        employee.setPhoneNumber(employee.getPhoneNumber());
        employee.setEmail(employee.getEmail());
        employee.setAddress(employee.getAddress());
        employee.setJobTitle(employee.getJobTitle());
        employee.setJoiningDate(employee.getJoiningDate());
	    
	    employeeService.saveEmployee(employee);
		List<Employee> employees = employeeService.getAllEmployees();
		model.addAttribute("emp", employees);
		return "Employee_list";
    }
    
}
