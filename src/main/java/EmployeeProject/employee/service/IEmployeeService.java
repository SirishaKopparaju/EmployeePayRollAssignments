package EmployeeProject.employee.service;


import java.util.List;
import java.util.Optional;

import EmployeeProject.employee.entity.Employee;


public interface IEmployeeService {
	Employee add(Employee emp);

	Optional<Employee> findById(int id);

	List<Employee> getAll();


	String deleteById(int id);

	Employee editEmployee(Employee employee, int id);

	String editEmployee(Employee employee, int id, Object emp);

}
