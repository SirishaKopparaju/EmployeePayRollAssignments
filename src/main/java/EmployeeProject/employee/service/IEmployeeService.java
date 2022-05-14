package EmployeeProject.employee.service;


import java.util.List;
import java.util.Optional;

import EmployeeProject.employee.entity.Employee;


public interface IEmployeeService {
	Employee add(Employee emp);

	Optional<Employee> findById(int id);

	List<Employee> getAll();

}
