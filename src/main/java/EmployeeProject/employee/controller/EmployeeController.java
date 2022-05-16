package EmployeeProject.employee.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import EmployeeProject.employee.dto.EmployeeDTO;
import EmployeeProject.employee.dto.ResponseDTO;
import EmployeeProject.employee.entity.Employee;
import EmployeeProject.employee.service.EmployeeService;
import EmployeeProject.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	//public static final String template = "Hello, %s!";
    
	/*autowired is a dependency injection*/

	 @Autowired
	 /*-----created a object service and used interface IEmployeeService-----*/
	  IEmployeeService service;
	 
	 /*--------------printing hello message---------------------- */

	@RequestMapping(value= {"","/","/home"})
	public String sayHello() {
		return "Hello from bridgelaz!!!!!";
	}
	
	/*-----------creating employee data using EmployeeDTO-------used add method and PostMapping --New object employee1--*/
	@PostMapping("/post")
    public ResponseEntity<ResponseDTO> createEmployees(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee1 = new Employee(employeeDTO);
        ResponseDTO responseDTO = new ResponseDTO("Employee Created Successfully", service.add(employee1));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }
    
    /*------------finding by id------used FindById--------GetMapping method------------------*/
    @GetMapping("/find/{id}")
    public ResponseEntity<ResponseDTO> findById(@PathVariable(value = "id") int id)
    {
    	ResponseDTO responseDTO = new ResponseDTO("Employee found Successfully", service.findById(id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    
    /*--------------------getting by id---------used getAll method -----GetMapping method------------*/
    @GetMapping("/all")
    public ResponseEntity<ResponseDTO> getAll(){
    	ResponseDTO responseDTO = new ResponseDTO("Employee found all Successfully", service.getAll());
    	return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    
    /*---------------------delete by id-----used deleteById----DeleteMapping Methods-----------------*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployee(@PathVariable int id){
    	ResponseDTO responseDTO = new ResponseDTO("Employee deleted id Successfully", service.deleteById(id));
    	return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    
    /*-------------------------updating by id------used editEmployee----PutMapping--------------*/
    @PutMapping("update/{id}")
    public ResponseEntity<ResponseDTO> editEmployee(@RequestBody EmployeeDTO employeeDTO, @PathVariable int id) {
        ResponseDTO responseDTO = new ResponseDTO("Employee Updated Successfully", service.editEmployee(employeeDTO, id));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
    
}
