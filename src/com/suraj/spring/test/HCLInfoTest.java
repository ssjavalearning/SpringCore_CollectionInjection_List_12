package com.suraj.spring.test;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.beans.Employee;
import com.suraj.spring.beans.HCLInfo;

public class HCLInfoTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("spring.xml");
			HCLInfo info = context.getBean("info", HCLInfo.class);
			List<String> nameList = info.getNameList();
			for (String nList : nameList) {
				System.out.println(nList);
			}
			System.out.println("--------------------------------------------------");
			List<Employee> empList = info.getEmpList();
			for (Employee employee : empList) {
				System.out.println(employee.getId()+"\t"+employee.getName()+"\t"+employee.getOrgName());
			}
			
		} catch (BeansException e) {
			e.printStackTrace();
		} finally {
			if (context != null) {
				((AbstractApplicationContext) context).close();
			}
		}
	}

}
