package fr.formation.inti.service;

import java.util.List;

import fr.formation.inti.entities.Employee;

public interface IEmployeeService {

	void persist(Employee e);

	Integer save(Employee e);

	void update(Employee e);

	Employee findById(Integer id);

	void delete(Integer id);

	void delete(Employee e);

	List<Employee> findAll();

	void update(List<Employee> employees);


}