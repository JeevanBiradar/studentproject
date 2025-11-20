package com.student;

import java.util.ArrayList;

public class Studentopimp implements StudentOperations{
	
	
	ArrayList<Student> studentlist = new ArrayList<Student>();
	
	
	@Override
	public void addstudent(Student s) {
		
		//to be implemented by Arun
		studentlist.add(s);
		
	}
	
	@Override
	public Student findstudentbyid(int id) {

		    for (Student s : studentlist) {
		        if (s.getRollnumber() == 2) {
		            return s;   
		        }
		    }

		    return null;   
		}



	@Override
	public void deletestudent(int id) {

		//to be implemented by Ragin
	}

	@Override
	public void updatestudent(int id,Student newdetail) {
		
		//to be implemented by jeevan
		
	}
	

}
