package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Charan");
		names.add("Akhi");
		names.add("Cherry");
		names.add("Likhitha");
		names.add("Shivani");
		System.out.println("Names are  ");
		for(String s : names){
			System.out.println(s);
	}
}
}
