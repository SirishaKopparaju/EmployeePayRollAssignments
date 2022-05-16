package EmployeeProject.employee.dto;

import java.time.LocalDate;

public class EmployeeDTO {
	
	public EmployeeDTO() {
		super();
	}
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
	@Override
	public String toString() {
		return "EmployeeDTO [fullName=" + fullName + ", profiePic=" + profiePic + ", gender=" + gender + ", department="
				+ department + ", salary=" + salary + ", startDate=" + startDate + ", notes=" + notes + "]";
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
	public String fullName;
	public String profiePic;
	public String gender;
	public String department;
	public int salary;
	public LocalDate startDate;
	public  String notes;

}
