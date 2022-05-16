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
	   
	    @Override
	    public Optional<Employee> findById(int id) {

	        return repo.findById(id);
	    }
	    
	    @Override
	    public List<Employee> getAll() {
	        return repo.findAll();
	    }
	    

	   
		public String deleteById(int id) {
			 repo.deleteById(id);
		        return "Employee with ID: " + id + " is Deleted Successfully!!";
		    }

		

		@Override
		public Employee editEmployee(Employee employee, int id) {
			Employee editEmployee=new Employee(employee);
			editEmployee.setId(id);
			repo.save(editEmployee);
			return editEmployee;
		}

		@Override
		public String editEmployee(Employee employee, int id, Object emp) {
			// TODO Auto-generated method stub
			return null;
		}
	
		}
	
	
		
		

		
