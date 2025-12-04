package interviewQuestion;

public class Second_Equals_A {
	public static void main(String[] args) {
		String s1 = new String("Hello");// Capital letter H		
		String s2 = new String("hello");//small letter h
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //false
	}
}
