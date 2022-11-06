package com.example.springredis.service;

import java.util.List;
import java.util.Map;

import com.example.springredis.model.Employee;
public interface EmployeeService {


	////////// test dao postgesql

	List<Employee> findAll();

	Employee insertEmployee(Employee emp);

	void executeUpdateEmployee(Employee emp);

	public void deleteEmployee(Employee emp);
}
