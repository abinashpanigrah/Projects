package com.employee.entities;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
	
	@Column(name="employee_id", nullable=false, unique=true)
	private String employeeId;
	
	@Column(name="first_name", nullable=false, length=45)
	private String firstName;
	
	@Column(name="last_name", nullable=false, length=45)
	private String lastName;
	
	@Column(name="gender")
	private String gender;

	@Column(name="date_of_birth")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;

	@Column(name="phone_number", nullable=false)
	private String phoneNumber;

	@Column(name="email", nullable=false, unique=true)
	private String email;

	@Column(name="address")
	private String address;

	@Column(name="job_title", nullable=false)
	private String jobTitle;

	@Column(name="joining_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date joiningDate;

	public long getId() 
	{
	         return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(String employeeId) 
	{
		this.employeeId = employeeId;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getJobTitle() 
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) 
	{
		this.jobTitle = jobTitle;
	}

	public Date getJoiningDate() 
	{
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) 
	{
		this.joiningDate = joiningDate;
	}
}
