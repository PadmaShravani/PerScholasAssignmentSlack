package com.Perscholas.OOp;
/*Write a program that uses loops without the reverse( ) method to take a 
 * multi-word string and reverse each word but keep the same word order in the string
 *  (e.g., “Hello world!” would become “olleH !dlrow”). */
public class StringTopic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world!";
		StringBuilder sb=new StringBuilder();
		for (String part : s.split(" ")) {
		    System.out.print(sb.append(part).reverse().toString());
		    System.out.print(" ");
		}
	}
}
