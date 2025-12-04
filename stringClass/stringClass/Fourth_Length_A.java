package stringClass;
/*	Count number of letter along with spaces and gives
 	integer value in length*/
public class Fourth_Length_A {
	
	public static void main(String[] args) {
		String s1 = "I want to run";
		System.out.println(s1.length());
		String[] s2 = s1.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2[3]);
	}
}
