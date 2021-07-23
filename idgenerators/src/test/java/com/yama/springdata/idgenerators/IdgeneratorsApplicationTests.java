package com.yama.springdata.idgenerators;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yama.springdata.idgenerators.entities.Employee;
import com.yama.springdata.idgenerators.repos.EmployeeRepository;

@SpringBootTest
class IdgeneratorsApplicationTests {
	
	@Autowired
	EmployeeRepository er;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreateEmployee() {
		Employee employee = new Employee();
		//employee.setId(123L);
		employee.setName("John");
		er.save(employee);
	}

}
