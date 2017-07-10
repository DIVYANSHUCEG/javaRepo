/*
 *  Program for get the first name and last name
 */
package com.au.divyansnhu;

import java.util.logging.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class First.
 */
public class First {
	  private static final String FIRST_NAME_IS = "First Name is ";
	private static final String LAST_NAME_IS = "Last Name is ";
	private static Logger logger = Logger.getLogger("First");  
	/** The first name. */
	private static final String FIRST_NAME = "Divyanshu";
	
	/** The last name. */
	private static final String LAST_NAME = "Kumar";
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	private static  String getFirstName(){
		logger.info(FIRST_NAME_IS+ FIRST_NAME);
		return FIRST_NAME;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	private static  String getLastName(){
		logger.info(LAST_NAME_IS + LAST_NAME);
		return LAST_NAME;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String... args){
		System.out.println(getFirstName()+"  "+getLastName());
	}
}