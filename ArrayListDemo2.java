package com.infinite.colls;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
 public static void main(String[] args) {
	List employList = new ArrayList();
	employList.add(new Employ(1,"Vaishu",84324));
	employList.add(new Employ(2,"Siri",83223));
	employList.add(new Employ(3,"Akhi",91123));
	employList.add(new Employ(4,"Harshit",90884));
	employList.add(new Employ(5,"Raghav",87233));
 for(Object ob : employList){
	 Employ employ = (Employ)ob;
	 System.out.println(employ);
 }
	
}
}
