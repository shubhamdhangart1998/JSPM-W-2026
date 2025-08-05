package com.tnsif.decisionmaking;

public class DecisionMakingWithOperator {

	public static void main(String[] args) {
		
		int x=8, y=7;
		int a=10;
		int b=11;
		
		if(x>=y)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		//a=10 , b=11
		
		if(!(a<b) || (a==b))
		{
			System.out.println("Condition True");
		}
		else {
			System.out.println("Condition is false");
		}

	}

}
