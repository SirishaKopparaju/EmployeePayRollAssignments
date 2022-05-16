package EmployeeProject.employee.dto;


public class ResponseDTO {
	private String name;
	private Object data;
	
	public ResponseDTO(String name, Object data) {
		super();
		this.name = name;
		this.data = data;
	}
	
	public ResponseDTO() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	

}
