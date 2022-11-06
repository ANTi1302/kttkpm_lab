package com.example.springredis.dao;

import java.util.List;
import java.util.Map;

import com.example.springredis.model.Employee;

public interface IEmployeeDao {

	void saveEmployee(Employee emp);

	Employee getOneEmployee(Integer id);

	void updateEmployee(Employee emp);

	Map<Integer, Employee> getAllEmployees();

//	void deleteEmployee(Integer id);

	void saveAllEmployees(Map<Integer, Employee> map);

	////////// test dao postgesql

	List<Employee> findAll();

	void insertEmployee(Employee emp);

	void executeUpdateEmployee(Employee emp);

	public void deleteEmployee(Employee emp);

}