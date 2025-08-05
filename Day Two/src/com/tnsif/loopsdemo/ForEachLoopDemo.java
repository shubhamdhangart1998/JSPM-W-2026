package com.tnsif.loopsdemo;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		
		//for integer array 
		
		for(int i:a)
		{
			System.out.print(i+"\t");
		}
		
		System.out.println();
		char ch[]= {'j','a','v','a'};
		for(char c : ch) {
			System.out.print(c);
		}

	}

}
