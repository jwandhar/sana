package com.spring.lab13;

import java.util.ArrayList;

public class SBU {
	private String sbuId;
	private String sbuName;
	private String sbuHead;
	public String getSbuId() {
		return sbuId;
	}
	public void setSbuId(String sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	ArrayList<Employee> emplist;
	
	
	public ArrayList<Employee> getEmplist() {
		return emplist;
	}
	public void setEmplist(ArrayList<Employee> emplist) {
		this.emplist = emplist;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", emplist=" + emplist + "]";
	}
	
}
