package EmployeeProject.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity


public class Employee {
	
	@Id
	@GeneratedValue
	
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private String email;
	private int moblieNumber;
	private String startDate;
	

	public Employee(int id, String firstName, String lastName, int salary, String email, int moblieNumber,
			String startDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.email = email;
		this.moblieNumber = moblieNumber;
		this.startDate = startDate;
	}
	
	
	public Employee() {
		
	}
	public Employee(Employee employee) {
		this.id=employee.id;
        this.firstName = employee.firstName;
        this.lastName = employee.lastName;
        this.salary = employee.salary;
        this.email = employee.email;
        this.moblieNumber = employee.moblieNumber;
        this.startDate = employee.startDate;
        
    }



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMoblieNumber() {
		return moblieNumber;
	}
	public void setMoblieNumber(int moblieNumber) {
		this.moblieNumber = moblieNumber;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
   


}
