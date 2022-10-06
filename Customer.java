package com.infinite.colls;

import java.util.ArrayList;
import java.util.List;

public class Customer {
int custId;
String name;
String city;
double premium;


public static void main(String[] args) {
	List names = new ArrayList();
	names.add("Charan");
	names.add("Akhi");
	names.add("Cherry");
	names.add("Likhitha");
	names.add("Shivani");
	System.out.println("Names are  ");
	for(Object ob : names){
		System.out.println(ob);
	}

}

	
}

