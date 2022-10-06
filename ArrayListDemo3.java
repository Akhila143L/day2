package com.infinite.colls;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		List studentList = new ArrayList();
		studentList.add(new Student(1,"Vaishu","Vijayawada",8.7));
		studentList.add(new Student(2,"Siri","Hyderabad",8.5));
		studentList.add(new Student(3,"Akhi","Vizag",9.2));
		studentList.add(new Student(4,"Harshit","Hyderabad",8.0));
		studentList.add(new Student(5,"Raghav","Banglore",9.0));;
	 for(Object ob : studentList){
		 Student student = (Student)ob;
		 System.out.println(student);
	 }
		
}
}
