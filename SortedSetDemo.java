package com.infinite.colls;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet names = new TreeSet();
		names.add("Bhargavi");
		names.add("Javed");
		names.add("Akhila");
		names.add("vardhil");
		names.add("Naveen");
		names.add("Likhitha");
		for(Object ob : names){
			System.out.println(ob);
		}
	}
}
