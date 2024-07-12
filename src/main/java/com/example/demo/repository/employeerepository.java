package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modals.employee;

@Repository
public interface employeerepository extends CrudRepository<employee, Integer>  {

	employee findByEmail(String email);

}
