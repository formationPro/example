package fr.formation.inti;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.formation.inti.entities.Employee;
import fr.formation.inti.service.IEmployeeService;

public class AppSpring {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		IEmployeeService service = context.getBean("serviceEmp", IEmployeeService.class);
		
		List<Employee> employees = service.findAll();
		for(Employee e : employees)
			System.out.println(e);
		System.out.println("=========");
		Employee emp = service.findById(3);
		System.out.println(emp);
		
		context.close();
	}

}
