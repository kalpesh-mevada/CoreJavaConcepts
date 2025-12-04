package interviewQuestion;
/*	Object created with syntax new, it can’t be reuse. 
 * 	Object created with syntax without new keyword us 
 	reusable object*/
public class Fourth_Equals_A {
	public static void main(String[] args) {
		String s1 = new String("xyz");
		String s2 = new String("xyz");
		String s3 = "xyz";
		String s4 = "xyz";
		String s5 = new String("xyz");
		String s6 = "xyz";
		System.out.println(s1==s2); //false
		System.out.println(s3==s4); //true
		System.out.println(s5==s3); //false
		System.out.println(s6==s3);//true
		
	}
}
