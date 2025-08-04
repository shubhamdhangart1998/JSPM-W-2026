package com.tnsif.dayone;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening //implicit type casting
		
		byte b=10;
		int l=b;
		System.out.println(l);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char ch='A';
		int i=ch;
		
		//narrowing //expilcit type casting 
		double f1=10.52f;
		
		long ll=(long) f1;
		System.out.println(ll);
		
		long i2=8668525992l;
		
		int b1=(int) i2;
		System.out.println(b1);
		
		
		

	}

}
