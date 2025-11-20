package com.student;

import java.util.ArrayList;

public class Studentopimp implements StudentOperations{
	
	
	ArrayList<Student> studentlist = new ArrayList<Student>();
	
	
	@Override
	public void addstudent(Student s) {
		
		//to be implemented by Arun
	}
	
	@Override
	public Student findstudentbyid(int id) {

	     //to be implemented by Meghana
		return null;
	}


	@Override
	public void deletestudent(int id) {
		Student found = null;
	    for (Student ele : studentlist) {
	        if (ele.getRollnumber() == id) {
	            found = ele;
	            break;
	        }
	    }
	    if (found != null) {
	        studentlist.remove(found);
	    }
		
	}

	@Override
	public void updatestudent(int id,Student newdetail) {
		
		//to be implemented by jeevan
		
	}
	

}
