package com.techlab.student.test;

import java.util.ArrayList;

import java.util.Collections;

import com.techlab.student.FnameSorter;
import com.techlab.student.LnameSorter;
import com.techlab.student.RollNoSorter;
import com.techlab.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Anupam", "Kumar"));
		studentList.add(new Student(4, "Ankit", "Tiwari"));
		studentList.add(new Student(2, "Aaan", "ffff"));
		studentList.add(new Student(5, "Megha", "Tanwar"));
		studentList.add(new Student(3, "Ramesh", "Patel"));
		System.out.println(studentList);
		Collections.sort(studentList,new RollNoSorter());
		System.out.println(studentList);
		Collections.sort(studentList,new FnameSorter());
		System.out.println(studentList);
		Collections.sort(studentList,new LnameSorter());
		System.out.println(studentList);
		
		
	}

}
