package com.greatlearning.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public List<Employee> findEmployeeByFirstname(String firstname);

	public List<Employee> findAllByOrderByFirstnameAsc();

	public List<Employee> findAllByOrderByFirstnameDesc();

}