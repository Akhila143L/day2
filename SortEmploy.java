package com.infinite.gen;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {

	public static void main(String[] args) {
		Comparator<Employ> c = new NameComparator();
		SortedSet<Employ> employList = new TreeSet<Employ>();
		employList.add(new Employ(1,"Vaishu",84324));
		employList.add(new Employ(2,"Siri",83223));
		employList.add(new Employ(3,"Akhi",91123));
		employList.add(new Employ(4,"Harshit",90884));
		employList.add(new Employ(5,"Raghav",87233));
	}
}
