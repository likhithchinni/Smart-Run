package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class AppController {
	
	@Autowired
	EmployeeRepostitory employeeRepository;
	
	
	@GetMapping("/employee/view")
	public List<Employee> getEmployee() {
		List<Employee> employee = (List<Employee>) employeeRepository.findAll();
		return employee;
	}

	@PostMapping("/employee/add")
	public Employee saveEmployee(@RequestBody Employee employee) {
		try {
			//int EmpID=Integer.valueOf(employee.getEmpId());
			System.out.println(employee.getEmpId());
			//System.out.println(employeeRepository.getEmpId(employee.getEmpId()));
			List<Employee> tem = (List<Employee>) employeeRepository.getEmployeeId(employee.getEmpId());
			System.out.println(tem);
			Employee temp = employeeRepository.save(employee);
			return temp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@DeleteMapping("/employee/delete/{employeeId}")
	public Boolean deletePost(@PathVariable String employeeId) {
		try {
			employeeRepository.deleteById(employeeId);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@PutMapping("/employee/edit")
	public Employee editEmployee(@RequestBody Employee employee) {
		try {
			employee = employeeRepository.save(employee);
			return employee;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
