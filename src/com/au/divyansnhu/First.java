/*
 *  Program for get the first name and last name
 */
package com.au.divyansnhu;

import java.util.logging.Logger;

/**
 * The Class First.
 */
public class First {
	/** The first name. */
	private static final String FIRST_NAME = "Divyanshu";
	
	/** The last name. */
	private static final String LAST_NAME = "Kumar";
	private static final String FIRST_NAME_IS = "First Name is "+FIRST_NAME;
	private static final String LAST_NAME_IS = "Last Name is "+LAST_NAME;
	private static Logger logger = Logger.getLogger("First");  
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	private static  String getFirstName(){
		logger.info(FIRST_NAME_IS);
		return FIRST_NAME;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	private static  String getLastName(){
		logger.info(LAST_NAME_IS);
		return LAST_NAME;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */   
	public static void main(String... args){
		logger.info(getFirstName()+"  "+getLastName());
	}
}