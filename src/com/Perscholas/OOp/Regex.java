package com.Perscholas.OOp;
/*Write a program that creates a String variable and initializes it with a phrase or 
 * series of words such as “Don’t repeat yourself”. Use the String split( ) method to 
 * split the words into a String array and loop through the array and print each word. 
 * Try different characters as splitters such as 2 spaces, a comma, an asterisk, etc. */
public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "word1, word2 word3@word4?word5.word6*sss&gf123^shra";
		String[] arr=s.split("[$&+,:;=?@#|'<>.-^*()%!]");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
