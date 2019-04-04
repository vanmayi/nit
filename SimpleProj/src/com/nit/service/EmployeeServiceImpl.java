package com.nit.service;

import com.nt.dao.EmployeeDAO;
import com.nt.dao.EmployeeDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
  private EmployeeDAO dao;
	@Override
	public String empDetails() {
		// TODO Auto-generated method stub
		dao=new EmployeeDAOImpl();
		//use dao
		String result=dao.insert();
		return result;
	}

}
