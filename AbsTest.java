package com.infinite.abs;

abstract class Vehicle{
	abstract void name();
	abstract void type();

}
class PassionPro extends Vehicle{

	@Override
	void name() {
		System.out.println("Name is PassionPro...");		
		
	}

	@Override
	void type() {
		System.out.println("Its 2 Wheeler...");		
		
	}
	
}
class Scross extends Vehicle{

	@Override
	void name() {
		System.out.println("Name is Scross...");		
		
	}

	@Override
	void type() {
		System.out.println("Its  4-Wheeler...");		
		
	}
	
}
public class AbsTest {
public static void main(String[] args) {
	Vehicle[] arr = new Vehicle[]{
			new Scross(),
			new PassionPro()
			
	};
	for (Vehicle v : arr){
		v.name();
		v.type();
		
	}
}
}
