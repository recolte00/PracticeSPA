package com.yama.springdata.customer;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.yama.springdata.customer.entities.Customer;
import com.yama.springdata.customer.repos.CustomerRepository;

@SpringBootTest
class CustomerdataApplicationTests {
	
	@Autowired
	CustomerRepository repository;
	
	@Autowired
	EntityManager entityManager;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testCreate() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Kogarashisan");
		customer.setEmail("gogogo@i.b.jp");
		
		repository.save(customer);
	}
	
	@Test
	public void testRead() {
		Customer customer = repository.findById(1).get();
		assertNotNull(customer);
		assertEquals("Kogarashisan", customer.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>" + customer.getEmail());
	}
	
	@Test
	public void testUpdate() {
		Customer customer = repository.findById(1).get();
		customer.setEmail("bababa@a.b.com");
		repository.save(customer);
	}
	
	@Test
	public void testDelete() {
		if (repository.existsById(1)) {
			repository.deleteById(1);
		}
	}
	
	@Test
	public void testCount() {
		System.out.println("Total Records============>>>>>"+repository.count());
	}
}
