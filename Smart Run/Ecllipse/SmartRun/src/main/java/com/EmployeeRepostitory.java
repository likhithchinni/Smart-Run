package com;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepostitory extends CrudRepository<Employee, String> {


	
	@Query(value = "select * from employee where emp_id='emId' ", nativeQuery = true)
	List<Employee> getEmployeeId(String empId);

	


}
