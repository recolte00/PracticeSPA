package com.yama.springdata.customer.repos;

import org.springframework.data.repository.CrudRepository;

import com.yama.springdata.customer.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
