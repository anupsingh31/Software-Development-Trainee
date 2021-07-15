package com.techlab.engineering.college.test;

import com.techlab.engineering.college.Professor;
import com.techlab.engineering.college.Student;

public class EngineeringDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1, "Mira Road", "31/10/2000");
		s.setBranch("Information Technology");
		Professor p = new Professor(1, "Andheri", "12/12/1970");
		p.setSalary(25000, 5000, 2500, 6000, 2000);
		System.out.println("Id = " + s.getId() + " Address = " + s.getAddress() + " DOB = " + s.getDOB() + " Branch = "
				+ s.getBranch());
		System.out.println("Id = " + p.getId() + " Address = " + p.getAddress() + " DOB = " + p.getDOB() + " Salary = "
				+ p.getSalary());
	}

}
