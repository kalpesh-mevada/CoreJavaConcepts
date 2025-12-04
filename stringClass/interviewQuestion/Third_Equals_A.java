package interviewQuestion;
/*	String s1 = “xyz“ and s2 =”xyz”: This will not immediate 
	create object, it will search for space available and is 
	there same value with other object as same syntax, then 
	same value of string both the object will replace with other object.
	-	Object have multiple references.*/
public class Third_Equals_A {
	public static void main(String[] args) {
		String s1 = "xyz"; // s1 = xyz
		String s2 = "xyz"; // replace s1 with s2 = xyz
		String s3 = "xxx"; // s3 = xxx
		String s4 = "xyz"; // replace s2 with s4 = xyz
		//compare memory address not value of string
		System.out.println(s1==s2); //true
		System.out.println(s2==s4); // true
		System.out.println(s3==s1); //false
	}
}
