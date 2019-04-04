package com.nt.test;

import com.nit.controller.EmployeeController;

public class EmployeeTest {
	private static EmployeeController controller;
	public static void main(String[] args) {
		

controller=new EmployeeController();
String result=controller.empDeatils();
System.out.println(result);

	}

}
