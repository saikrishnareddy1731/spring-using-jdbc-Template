package com.example.service;

import java.util.List;

import com.example.DTO.Employee;


public interface EmployeeService {
	public void create(String name, Integer age);

	public Employee getEmployee(Integer id);

	public List<Employee> listEmployees();

	public void delete(Integer id);

	public void update(Integer id, Integer age);
}
