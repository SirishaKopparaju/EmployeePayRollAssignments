package EmployeeProject.employee.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import EmployeeProject.employee.entity.Employee;
import EmployeeProject.employee.service.EmployeeService;
import EmployeeProject.employee.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	//public static final String template = "Hello, %s!";
    

	 @Autowired
	  IEmployeeService service;
	 
	 /*--------------printing hello message---------------------- */

	@RequestMapping(value= {"","/","/home"})
	public String sayHello() {
		return "Hello from bridgelaz!!!!!";
	}
	
	/*-----------creating employee data----------------------*/
    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
    //change method name,it should be valid
        return service.add(employee);
    }
    
    /*------------finding by id--------------------------------*/
    @GetMapping("/find/{id}")
    public Optional<Employee> findById(@PathVariable(value = "id") int id)
    {
        return service.findById(id);
    }
    
    /*--------------------getting by id--------------------------*/
    @GetMapping("/all")
    public List<Employee> getAll(){
        return service.getAll();
    }
    
    /*---------------------delete by id--------------------------*/
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id){
         return service.deleteById(id);
         
    }
    
    /*-------------------------updating by id------------------------*/
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable int id)
    {
    	return service.editEmployee(employee,id);
    	
    }
}
