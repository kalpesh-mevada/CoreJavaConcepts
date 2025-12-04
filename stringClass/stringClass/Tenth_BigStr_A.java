package stringClass;
/*Print the biggest word from given String “Testing Time”.*/
public class Tenth_BigStr_A {
	
	public static void main(String[] args) {
		String s1 = "Testing time";
		// split both string by white space.
		// store string in array.
		String[] s2 = s1.split(" ");
		String temp = null;
		if(s2[0].length()>s2[1].length()){
			temp = s2[0];
		}
		if(s2[1].length()>s2[0].length()){
			temp = s2[1];
		}
		if(temp!=null){
			System.out.println("The Biggest Word is: "+temp);
		}else {
			System.out.println("Many words with same size");
		}
	}
}
