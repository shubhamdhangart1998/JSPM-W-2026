package com.tnsif.loopsdemo;

public class NestedFoLoopDemo {

	public static void main(String[] args) {
		//2 * 1 = 2
		//2 * 2 =4
		//program to print the multiplication of tables 
		int beg=5;
		int end=7;
		
		for(int i=beg; i<=end; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i + "*"+ j+ "="+i*j);
			}
			System.out.println();
		}

	}

}
