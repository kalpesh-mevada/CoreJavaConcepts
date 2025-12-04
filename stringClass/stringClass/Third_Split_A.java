package stringClass;
/*Split will sperate each words and split in array*/
public class Third_Split_A {
	
	public static void main(String[] args) {
		String s1 = "I want to run";
		System.out.println(s1+"\n");
		String[] s2 = s1.split(" ");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
		System.out.println(s2[2]);
		System.out.println(s2[3]);
	}
}
