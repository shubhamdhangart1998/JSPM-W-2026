package com.tnsif.jumpdemo;

public class SwitchDemo {

	public static void main(String[] args) {

		int userInputs=90;
		switch(userInputs)
		{
		case 1:
			System.out.println(userInputs + ": Current plan details ");
			break;
			
		case 2:
			System.out.println(userInputs + ": New Offers ");
			break;
			
		case 3:
			System.out.println(userInputs + ": Talk to our customer support person ");
			break;
			
		case 4:
			System.out.println(userInputs + ": new plans for you");
			break;
		
			default:
				System.out.println(userInputs +": you had put wrong input ");
				break;
		}
	}

}
