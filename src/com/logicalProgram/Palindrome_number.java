package com.logicalProgram;

public class Palindrome_number {
	public static void main(String [] args) {  //palindrome number program, reverse number, 
		int number =1234;
		int reverse=0, reminder; 
		
		
		while(number>0) {    
			reminder = number%10;    //1
			reverse = reverse * 10 + reminder;  //4321
			number = number / 10; //1
			
		}
		System.out.println("Reverse of given number is" + reverse);
	
	



int num1=121;
int num = 121;
int rev = 0;
int rem;
while(num>0) {   //palindrome number
	rem = num%10;
	rev = rev*10 + rem;
	num = num/10;
	
	if(num1==rev) {
		System.out.println("This number is palindrome number");
	}
	else {
		System.out.println("This number is not palindrome number");
	}
}
	
	
	
	}
}