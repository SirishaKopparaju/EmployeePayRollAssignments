package EmployeeProject.employee.service;


import java.util.List;
import java.util.Optional;

import EmployeeProject.employee.dto.EmployeeDTO;
import EmployeeProject.employee.entity.Employee;


public interface IEmployeeService {
	Employee add(Employee emp);

	Optional<Employee> findById(int id);

	List<Employee> getAll();


	String deleteById(int id);

	String editEmployee(EmployeeDTO employeeDTO, int id);


}
