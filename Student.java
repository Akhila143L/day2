package com.infinite.colls;

public class Student {
	int rollno;
	 String name;
	 String city;
	 double cgp;
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
	}
	public Student(int rollno, String name, String city, double cgp) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		this.cgp = cgp;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
}
