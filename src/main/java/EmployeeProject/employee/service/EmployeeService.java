package EmployeeProject.employee.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import EmployeeProject.employee.entity.Employee;
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
	    public String postMessage(Employee employee) {
	        return "Hello Employee " + employee.getFirstName() + "" + employee.getLastName() + "!";
	    }
	    public Optional<Employee> findById(int id) {

	        return repo.findById(id);
	    }
	    @Override
	    public List<Employee> getAll() {
	        return repo.findAll();
	    }
	    


	    public Optional<Employee> getById(int id) {
	        return repo.findById(id);
	        
	    }
	   
		public String deleteById(int id) {
			 repo.deleteById(id);
		        return "Employee with ID: " + id + " is Deleted Successfully!!";
		    }
		}

		
