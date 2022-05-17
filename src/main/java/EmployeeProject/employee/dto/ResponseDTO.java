package EmployeeProject.employee.dto;

import lombok.Data;

@Data
public class ResponseDTO {
	public ResponseDTO() {
		super();
	}

	private String name;
	private Object data;
	
	public ResponseDTO(String name, Object data) {
		super();
		this.name = name;
		this.data = data;
	}
	

}
