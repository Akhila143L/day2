package com.infinite.gen;

import java.util.ArrayList;
import java.util.List;


public class GenListEx2 {

	public static void main(String[] args) {
	List<Employ> employList = new ArrayList<Employ>();	
	employList.add(new Employ(1,"Vaishu",84324));
	employList.add(new Employ(2,"Siri",83223));
	employList.add(new Employ(3,"Akhi",91123));
	employList.add(new Employ(4,"Harshit",90884));
	employList.add(new Employ(5,"Raghav",87233));
	for(Employ e: employList){
		System.out.println(e);
	}
	}
}
