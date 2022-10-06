package com.infinite.colls;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	
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
