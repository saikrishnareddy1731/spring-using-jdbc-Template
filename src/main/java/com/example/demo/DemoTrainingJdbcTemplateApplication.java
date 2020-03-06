package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.DTO.Employee;
import com.example.dao.EmployeeServiceImpl;

@SpringBootApplication
public class DemoTrainingJdbcTemplateApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoTrainingKoeingJdbcTemplateApplication.class, args);
		
		
	 ApplicationContext context=SpringApplication.run(AppConfig.class, args);
		
		// remaining code will write after the break
		
		// perform operation @Employee
		
	EmployeeServiceImpl employeeJDBCTemplate = 
			context.getBean(EmployeeServiceImpl.class);
				
	// method call here 
	runEmployeeCRUD(employeeJDBCTemplate);
	
	}
	
	
	
	
    public static void runEmployeeCRUD(EmployeeServiceImpl 
    		employeeJDBCTemplate) {
			
		// create the employee data 
		
         // employeeJDBCTemplate.setupDB();
//		Scanner sc=new Scanner(System.in);
		System.out.println("------Records Creation--------");
//      System.out.println("Enter the name:");
//      String name=sc.nextLine();
//      System.out.println("Enter the id");
//      int id=sc.nextInt();
      
		employeeJDBCTemplate.create("siddu", 11);
		employeeJDBCTemplate.create("bano", 2);
		employeeJDBCTemplate.create("gridhar", 15);

		System.out.println("------Listing Multiple Records--------");
		List<Employee> employees = employeeJDBCTemplate.listEmployees();
		for (Employee record : employees) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.println(", Age : " + record.getAge());
		}
		
/*
		System.out.println("----Updating Record with ID = 2 -----");
		employeeJDBCTemplate.update(2, 20);

		System.out.println("----Listing Record with ID = 2 -----");
		Employee employee = employeeJDBCTemplate.getEmployee(2);
		System.out.print("ID : " + employee.getId());
		System.out.print(", Name : " + employee.getName());
		System.out.println(", Age : " + employee.getAge());
*/
		
		
	}
}
