package EmployeeProject.employee.dto;

import java.time.LocalDate;

import lombok.Data;


@Data
public class EmployeeDTO {
	public EmployeeDTO() {
		super();
	}
	
	public String fullName;
	public String profiePic;
	public String gender;
	public String department;
	public int salary;
	public LocalDate startDate;
	public  String notes;

	
	public EmployeeDTO(String fullName, String profiePic, String gender, String department, int salary,
			LocalDate startDate, String notes) {
		super();
		this.fullName = fullName;
		this.profiePic = profiePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.startDate = startDate;
		this.notes = notes;
	}
		
}
