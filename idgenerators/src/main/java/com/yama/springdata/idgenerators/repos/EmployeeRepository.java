package com.yama.springdata.idgenerators.repos;

import org.springframework.data.repository.CrudRepository;

import com.yama.springdata.idgenerators.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
