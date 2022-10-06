package com.infinite.intf;
interface IOne{
	void name();
}
interface ITwo{
	void email();
}
class Charan implements IOne,ITwo {

	@Override
	public void email() {
System.out.println("Email is Charan@gmail.com");		
	}

	@Override
	public void name() {
System.out.println("Name is Charan...");		
	}
	
}
public class Multinh {
public static void main(String[] args) {
	Charan obj = new Charan();
	obj.name();
	obj.email();
}
}
