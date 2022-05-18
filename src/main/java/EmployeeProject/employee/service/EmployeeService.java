package EmployeeProject.employee.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EmployeeProject.employee.dto.EmployeeDTO;
import EmployeeProject.employee.entity.Employee;
import EmployeeProject.employee.exceptionalhandling.ExceptionHandling;
import EmployeeProject.employee.repository.EmployeeRepository;


@Service
public class EmployeeService implements IEmployeeService {
	 private static final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();

	    @Autowired
	    private EmployeeRepository repo;

	    public Employee add(Employee emp) {
	        String message = String.format(template, (emp.toString().isEmpty()) ? "Hello World" : emp.toString());
	        return (Employee) repo.save(emp);
			
	    }
	   
	    @Override
	    public Optional<Employee> findById(int id) {
	    	if (repo.findById(id).isPresent()) {
	    		 return repo.findById(id);
	    	}
			else throw new ExceptionHandling("id is not present in table");
	    }
	    
	    @Override
	    public List<Employee> getAll() {
	        return repo.findAll();
	    }
	    

	   
		public String deleteById(int id) {
			if (repo.findById(id).isPresent()) {
			 repo.deleteById(id);
		        return "Employee with ID: " + id + " is Deleted Successfully!!";
		}
		else throw new ExceptionHandling("id is not present in table");
		}


		

		public String editEmployee(EmployeeDTO employeeDTO, int id) {
	        if (repo.findById(id).isPresent()) {
	            Employee employee1 = new Employee(id, employeeDTO);
	           Employee alpha = repo.save(employee1);
	           return "This is the result"+ alpha;
	        }
	        else throw new ExceptionHandling("id is not present in table");
	    }

		

		

		
	
		}
	
	
		
		

		
