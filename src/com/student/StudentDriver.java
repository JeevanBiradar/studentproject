package com.student;

public class StudentDriver {

	public static void main(String[] args) {
		
		
		
		Student s1 = new Student(1, "Arun", "Cse",75.00 );
		Student s2 = new Student(2, "Bharat", "Ece",85.00 );
		Student s3 = new Student(3, "Charan", "Mech",55.00 );
		Student s4 = new Student(4, "Deepak", "Chem",81.00 );
		Student s5 = new Student(5, "Eleven", "Civil",66.88 );
		
	  Studentopimp s = new Studentopimp();
	  
	      s.addstudent(s1);
	      s.addstudent(s2);
	      s.addstudent(s3);
	      s.addstudent(s4);
	      s.addstudent(s5);
	      
	      System.out.println(s.findstudentbyid(2));
	      
	      
	      Student update = new Student(6,"Neelesh","cse",77.55);
	      
	      
	      s.deletestudent(1);
	      
	      s.updatestudent(3,update);
	      
	      

	      
	      
		
		
	}

	
	
	
	
}
