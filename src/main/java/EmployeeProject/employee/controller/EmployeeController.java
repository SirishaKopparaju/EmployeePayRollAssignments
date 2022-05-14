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

@RestController
@RequestMapping("/Employee")



public class EmployeeController {
	public static final String template = "Hello, %s!";
    

	 @Autowired
	   EmployeeService service;

	@RequestMapping(value= {"","/","/home"})
	public String sayHello() {
		return "Hello from bridgelaz!!!!!";
	}
    @PostMapping("/employeePayrollService/create")
    public Employee sayWow(@RequestBody Employee employee) {
        return service.add(employee);
    }
    @GetMapping("/find/{id}")
    public Optional<Employee> greeting(@PathVariable(value = "id") int id)
    {
        return service.findById(id);
    }
    @GetMapping("/all")
    public List<Employee> getAll(){
        return service.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Employee> createUSer(@PathVariable int id){
        return service.getById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id){
         return service.deleteById(id);
    }
}
