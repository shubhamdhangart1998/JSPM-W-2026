package com.tnisf.daysix.usingfinal;

public class FinalMethodClass {

	
	//constructor 
	public FinalMethodClass() {
		System.out.println("This is a default constructor ");

	}
	
	final int a=50;
	
	
	//final method 
	final void show()
	{
		System.out.println("value of a :"+ a);
	}
	
}
