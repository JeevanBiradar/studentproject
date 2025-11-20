package com.student;

public interface StudentOperations {
	
	
	public Student findstudentbyid(int id);
	
	public void addstudent (Student s);
	
	public void deletestudent (int id);
	
	public void updatestudent(int id,Student newdetails);
	
	

}
