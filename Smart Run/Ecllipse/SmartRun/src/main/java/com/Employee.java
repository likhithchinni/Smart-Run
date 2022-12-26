package com;

import javax.persistence.*;

@Entity(name = "employee")
public class Employee {
	@Id
	@Column(name="Emp_ID",unique = true, length=8)
	String empId;
	@Column(name="Emp_Name", length=64)
	String empName;
	@Column(name="Address", length=64)
	String empAddress;
	@Column(name="PhoneNumber", length=64)
	String empPhnNum;
	
	public Employee() {
		super();
	}

	public Employee(String empId, String empName, String empAddress, String empPhnNum) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empPhnNum = empPhnNum;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpPhnNum() {
		return empPhnNum;
	}

	public void setEmpPhnNum(String empPhnNum) {
		this.empPhnNum = empPhnNum;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empPhnNum="
				+ empPhnNum + "]";
	}
	
	

}
