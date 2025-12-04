package stringClass;
/*	Print the given string is reverse order without 
 	any method.*/
public class Seventh_ReverseStr_A {
	public static void main(String[] args) {
		String s1 = "Testing";
		for(int i = s1.length()-1;i>=0;i--){
			//System.out.print(i);
			System.out.print(s1.charAt(i));
		}
	}
}
