package stringClass;
/*Print a given string “madam” in PALINDROME. and check also “madem”*/
public class Twelth_Palindrome_B {
	public static void main(String[] args) {
		String s1 = "madem"; //madam
		int count = 0;//
		int j = s1.length()-1;//5-1 = 4
		for(int i = 0; i < s1.length(); i++){
			if(s1.charAt(i) == s1.charAt(j--)){
				// i - 0 = j = 4: m=m true
				/* if madem, then 
				 * i - 1 = j = 3: a=e false so it will be exit.
				*/
				// i - 1 = j = 3: a=a true
				// i - 2 = j = 2: d=d true				
				// i - 3 = j = 1: a=a true
				// i - 4 = j = 0: m=m true
				count++;
			}			
		}
		if(count == s1.length()){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not Palindrome");
		}
	}
}
