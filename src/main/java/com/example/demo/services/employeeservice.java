package com.example.demo.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modals.employee;
import com.example.demo.repository.employeerepository;

@Service
public class employeeservice {
	@Autowired
	employeerepository repo;
	public employee insertion(employee e) {
		return repo.save(e);
		
	}
	public Iterable<employee> insertall(List<employee > e) {
		return repo.saveAll(e);
	}
	public List<employee> getall(){
		return (List<employee>) repo.findAll();
	}
	public Optional<employee> getbyid(int id) {
		return repo.findById(id);
		
	}
	public employee getbyemail(String email) {
		return repo.findByEmail(email);
	}
	public String deletebyid(int id) {
		repo.deleteById(id);
		return "successfully deleted :" +id;
	}
	public employee update(employee e) {
		int id=e.getId();
		employee emp=repo.findById(id).get();
		emp.setId(e.getId());
		emp.setRollno(e.getRollno());
		emp.setName(e.getName());
		emp.setEmail(e.getEmail());
		emp.setPassword(e.getPassword());
		emp.setBranch(e.getBranch());
		return repo.save(emp);
		
	}
}
