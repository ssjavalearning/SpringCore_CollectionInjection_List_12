package com.suraj.spring.beans;

import java.util.List;

public class HCLInfo {
	
	private List<String> nameList;
	private List<Employee> empList;
	
	public List<String> getNameList() {
		return nameList;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
}
