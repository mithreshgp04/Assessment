package com.prodapt.School;

public class SchoolRecords {
	
	static String Schoolname;
	static int Schoolid;
	static String Schooldata;
	
	static void ddRecords(String a,int b, String c) {
		
		a = Schoolname;
		b = Schoolid;
		c = Schooldata;
		
		System.out.println("The entered data have been stored successfully");
		
	}
	
	static void ddDisplay(String d,int e,String f) {
		
		
		System.out.println("The Details are \n");
		System.out.println("The school name is " +d);
		System.out.println("The school id is " +e);
		System.out.println("The school data is " +f);
	}

}
