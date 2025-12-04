package stringClass;
/*	Print a given String in reverse manner without using 
 	built in method reverse*/
public class Ninth_ReverseStr_B {
	public static void main(String[] args) {
		String s1 = "Testing";
		int size = s1.length();//size - 7
		String reverse = "";
		for(int i=size-1;i>=0;i--){
			// concat string with char and stored in reverse.
			reverse = reverse + s1.charAt(i);
		}
		System.out.println(reverse);
	}
}
