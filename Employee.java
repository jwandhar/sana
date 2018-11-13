package com.spring.lab13;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
//	SBU sb;
//
//	public SBU getSb() {
//		return sb;
//	}
//	public void setSb(SBU sb) {
//		this.sb = sb;
//	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Employee(int empId, String empName, double salary, SBU sb) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.salary = salary;
//		this.sb = sb;
//	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", sb=" + "]";
	}


}
