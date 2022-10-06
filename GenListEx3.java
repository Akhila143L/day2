package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class GenListEx3 {

	public static void main(String[] args) {
		Comparator<Student> c = new NameComparator1();
		SortedSet<Student> studentList = new TreeSet<Student>();
		studentList.add(new Student(1,"Vaishu","Vijayawada",8.7));
		studentList.add(new Student(2,"Siri","Hyderabad",8.2));
		studentList.add(new Student(3,"Akhi","Vizag",9.2));
		studentList.add(new Student(4,"Harshit","Tirupathi",8.0));
		studentList.add(new Student(5,"Raghav","Banglore",8.5));
}
}
