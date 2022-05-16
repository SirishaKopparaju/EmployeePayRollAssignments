package EmployeeProject.employee.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	private String fullName;
	private String profiePic;
	private String gender;
	private String department;
	private int salary;
	private LocalDate startDate;
	private  String notes;
	
	public Employee(int id, String fullName, String profiePic, String gender, String department, int salary,
			LocalDate startDate, String notes) {
		//yr-mm-dd
		super();
		this.id = id;
		this.fullName = fullName;
		this.profiePic = profiePic;
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
        this.profiePic=employee.profiePic;
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
		return profiePic;
	}
	public void setProfiePic(String profiePic) {
		this.profiePic = profiePic;
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
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}



	


}
