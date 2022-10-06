package com.infinite.intf;
 interface  ITraining{
	 void name();
	 void email();
 }
 class  Kumar implements ITraining{

		@Override
		public void name() {
	System.out.println("Name is Kumar...");		
		}

		@Override
		public void email() {
	System.out.println("Email is Kumar@gmail.com");		
		}
		 
	 }
 class  Cherry implements ITraining{

	@Override
	public void name() {
System.out.println("Name is Cherry...");		
	}

	@Override
	public void email() {
System.out.println("Email is Cherry@gmail.com");		
	}
	 
 }
public class InfDemo {
public static void main(String[] args) {
	ITraining[] arr = new ITraining[]{
			new Cherry(),new Kumar()
	};
	for(ITraining i : arr){
		i.name();
		i.email();
	}
  }
}
