package stringClass;
/*	Find out the given string is palindrome or not
 * 	Every character can compare using ==, if you compare string
 	,we should have to use equals method*/
public class Eighth_Palindrome_A {
	public static void main(String[] args) {
		String s1= "madam"; //madam
		int j = s1.length()-1;
		int size = s1.length()-1;
		for(int i=0; i<s1.length();i++){
			if(s1.charAt(i)==s1.charAt(j)){
				--j;
				if(i == size){
					System.out.println("Palindrome");
				}
			}else{
				System.out.println("Not Palindrome");
				break;
			}
		}		
	}
}
