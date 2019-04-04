package com.nt.test;

import com.nit.controller.EmployeeController;

public class EmployeeTest {

	public static void main(String[] args) {
		
      System.out.println("hi hello");
       EmployeeController controller=null;
       controller=new EmployeeController();
       String result=controller.empDeatils();
       System.out.println("Employee Details:: "+result);
	}

}
