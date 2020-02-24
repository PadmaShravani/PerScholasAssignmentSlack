package com.Perscholas.OOp;

import java.util.regex.Pattern;

/*String[] searchFound = {"youhavefoundme", "youdidntfindme", "notinthisone", "itisfoundhere"};
Write a program that uses the Pattern and Matcher classes along with a for loop to 
produce the following ouput:
I found it! :  youhavefoundme
I found it! :  itisfoundhere
 */
public class Regix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] searchFound = {"youhavefoundme", "youdidntfindme", "notinthisone", "itisfoundhere"};

	        boolean b;
	            for (int i = 0; i < searchFound.length; i++)
	              {
	            	//System.out.println("Entered for");
	            	b=Pattern.matches("^.*found.*$",searchFound[i]);
	            	//System.out.println(b);
	            	if(b)
	            	System.out.println("I found it!  :"+searchFound[i]);
	              }
	            
		
		}
	}


