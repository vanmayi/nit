package com.nit.service;

import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
  private EmployeeDAO dao;
	@Override
	public String empDetails() {
		// TODO Auto-generated method stub
		String result=null;
		dao=new EmployeeDAOImpl();
		//use dao method
		result=dao.insert();
		return result;
	}//method

}//class
