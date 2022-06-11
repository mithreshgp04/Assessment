package com.prodapt.Loan;

public class Loanamount {
	
	static float s;
	static int t = 2;
	static float i = 0.01f;
	
	static void process(int p ) {
		
		s = p*t*i;
		System.out.println("The Simple Intrest is " +s);
	}
	
	static void Total(int a) {
				System.out.println("The principle amount is " +a);
				float b = a + (12*s);
				System.out.println("The total amount to be paid after the duration is " +b);
	}

}
