package com.tnsif.dayfour.secondPackage;

import com.tnsif.dayfour.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
		// accessing different public, protected(inhert/child/subclass), default(no)

		Base b1=new Base();
		
		b1.methodPublic();
		
		b1.varPublic=544654;
		b1.methodPublic();
		
		//b1.methodProtected();
		
	}

}
