package com.logicalProgram;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		int userinput = sc.nextInt();
	//	int number= -5;
		int fact = 1;
		if(userinput==0) {
			System.out.println("Factorial of zero is 1");
		}
		else if (userinput>0) {
			for(int i=1;i<=userinput;i++) {
			fact = fact * i;  //1
			
			//System.out.println("Factorial of number " + i + " is - " + fact);
			}System.out.println("Factorial of number " + fact);
		}
		else {
			System.out.println("Factorial of negative number is not calculated");
		}
	
	}

}
