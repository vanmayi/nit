package com.nit.controller;

import com.nit.service.EmployeeService;
import com.nit.service.EmployeeServiceImpl;

public class EmployeeController {
	
	private EmployeeService service;
	
   public String empDeatils() {
	String result=null;
	service=new EmployeeServiceImpl();
	//use service method
	result=service.empDetails();
	return result;
  }//method
}//class
