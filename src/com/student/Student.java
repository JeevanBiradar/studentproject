package com.student;

public class Student {
	
	
	int rollnumber;
	String name;
	String  department;
	double marks;
	
	
	public Student(int rollnumber, String name, String department, double marks) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.department = department;
		this.marks = marks;
	}


	public int getRollnumber() {
		return rollnumber;
	}


	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", department=" + department + ", marks="
				+ marks + "]";
	}
	
	
	
	

}
