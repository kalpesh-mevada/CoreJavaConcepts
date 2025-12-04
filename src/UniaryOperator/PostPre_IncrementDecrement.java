package UniaryOperator;

public class PostPre_IncrementDecrement {

	
	public static void main(String[] args) {
		int i = 10;
		int j = i++ + ++i + --i + i++ + i--;
		
		// j = 10++ + ++11:12 + --12:11  + 11++ + 12--:11; = 10 + 12 + 11 + 11 + 12 = 56
		System.out.println(i); // 11
		System.out.println(j); // 
	}

}
