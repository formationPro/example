package fr.formation.inti.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.inti.dao.IEmployeeDao;
import fr.formation.inti.entities.Employee;

@Service("serviceEmp")
@Transactional
public class EmployeeService implements IEmployeeService {
	private final static Log log = LogFactory.getLog(EmployeeService.class);
	@Autowired
	private  IEmployeeDao dao;

	
	public  void setDao(IEmployeeDao dao) {
		this.dao = dao;
	}

	public EmployeeService() {
		log.info("spring EmployeeService");
	}
	
//	public EmployeeService(@Qualifier("employeeDaoImpl") IGenericDao<Employee, Integer> genericDao) {
//		log.info("spring EmployeeService");
//		this.dao = (IEmployeeDao) genericDao;
//	}

	@Override
	public void persist(Employee e) {
		dao.persist(e);
	}

	@Override
	public Integer save(Employee e) {
		return dao.save(e);
	}

	@Override
	public void update(Employee e) {
		dao.update(e);
	}

	@Override
	public Employee findById(Integer id) {	
		return dao.findById(id, Employee.class);
	}

	@Override
	public void delete(Integer id) {
		Employee emp = dao.findById(id, Employee.class);
		dao.delete(emp);
	}

	@Override
	public void delete(Employee e) {
		dao.delete(e);
	}

	@Override
	public List<Employee> findAll() {
		return dao.getAll();
	}

	@Override
	public void update(List<Employee> employees) {
		dao.update(employees);
	}

	
}
