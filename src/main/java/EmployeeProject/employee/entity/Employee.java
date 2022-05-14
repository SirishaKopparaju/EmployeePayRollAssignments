package EmployeeProject.employee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity


public class Employee {
	
	@Id
	@GeneratedValue
	
	
	private int id;
	private String fullName;
	private String ProfiePic;
	private String gender;
	private String department;
	private int salary;
	private int startDate;
	private  String notes;
	

	
	
	public Employee(int id, String fullName, String profiePic, String gender, String department, int salary,
			int startDate, String notes) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.ProfiePic = profiePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.startDate = startDate;
		this.notes = notes;
	}
	public Employee() {
		
	}
	public Employee(Employee employee) {
		this.id=employee.id;
        this.department=employee.department;
        this.fullName=employee.fullName;
        this.gender=employee.gender;
        this.notes=employee.notes;
        this.salary=employee.salary;
        this.ProfiePic=employee.ProfiePic;
        this.startDate=employee.startDate;
        
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getProfiePic() {
		return ProfiePic;
	}
	public void setProfiePic(String profiePic) {
		ProfiePic = profiePic;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}



	


}
