
package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx4 {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();	
		studentList.add(new Student(1,"Vaishu","Vijayawada",8.7));
		studentList.add(new Student(2,"Siri","Hyderabad",8.2));
		studentList.add(new Student(3,"Akhi","Vizag",9.2));
		studentList.add(new Student(4,"Harshit","Tirupathi",8.0));
		studentList.add(new Student(5,"Raghav","Banglore",8.5));
		for(Student s: studentList){
			System.out.println(s);
		}
	}
}
