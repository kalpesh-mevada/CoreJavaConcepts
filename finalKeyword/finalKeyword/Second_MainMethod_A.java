package finalKeyword;

import com.sun.org.apache.xpath.internal.operations.String;
// Typical interview question
public class Second_MainMethod_A {
	// make string[] args as final, then change size can't be 
	// altered.
	public static void main(final String[] args) { 
		//args = new String[3];	 we can't re initialize
	}
}
