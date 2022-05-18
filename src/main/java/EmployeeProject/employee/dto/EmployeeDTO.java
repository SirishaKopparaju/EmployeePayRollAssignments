package EmployeeProject.employee.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;


@Data
@ToString

public class EmployeeDTO {


	@Pattern(regexp ="^[A-Z]{1}[a-zA-Z]{2,}$", message = "Employee name is not valid")
	public String fullName;
	
	public String profiePic;
	
	public String gender;
	
	public String department;
	
	@Min(value = 10000, message = "salary ")
	public int salary;
	
	public LocalDate startDate;
	
	public  String notes;

public String toString() {
	return "fullName="+fullName+":salary="+salary;
	
}
		
}
