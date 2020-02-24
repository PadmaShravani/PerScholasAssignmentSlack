package com.Perscholas.OOp;
/*Write a program that creates a StringBuilder object named sb and initializes it with “Hello”
 Print out sb. Now use the append( ) method to append “ World!” to sb and print out sb again.
  Append “ World” again to sb. Print out sb. Next, use the insert( ) method to insert the 
  string “ New” in between “Hello” and “ World”. Next, use the replace( ) method to 
 * change “ New” to “ Old”. Print the result. Finally, use the reverse( ) method to reverse
 *  the entire string.
 */
public class StringTopic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder("Hello");
		sb.append("World!");
		System.out.println(sb);
		sb.insert(5, "New");
		System.out.println(sb);
		sb.replace(5, 7, "old");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
