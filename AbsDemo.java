package com.infinite.abs;

abstract class Training {
abstract void name();
abstract void email();

}
class Kumar extends Training{

	@Override
	void name() {
		System.out.println("Name is Kumar...");		
		
	}

	@Override
	void email() {
		System.out.println("Email is Kumar@gmail.com");		

	}
	
}
class Cherry extends Training{

	@Override
	void name() {
		System.out.println("Name is Cherry...");		

	}

	@Override
	void email() {
		System.out.println("Email is Cherry@gmail.com");		

	}
	
}
class Akhila extends Training{

	@Override
	void name() {
System.out.println("Name is Akhila...");		
	}

	@Override
	void email() {
System.out.println("Email is Akhila@gmail.com");		
	}
	
}
public class AbsDemo{
	public static void main(String[] args) {
		// Training obj1 = new Cherry();
		// Training obj2 = new Akhila();
		// Training obj3 = new Kumar();
		Training[] arr = new Training[]{
				new Cherry(),
				 new Akhila(),
				new Kumar()	
		};
		for(Training t : arr){
			t.name();
			t.email();
			
	} }}


