package com.au.divyansnhu;

public class First {
	private static String FIRST_NAME = "Divyanshu";
	private static String LAST_NAME = "Kumar";
	
	private static  String getFirstName(){
		return FIRST_NAME;
	}
	
	private static  String getLastName(){
		return LAST_NAME;
	}
	
	public static void main(String... args){
		System.out.println(getFirstName()+"  "+getLastName());
	}
}