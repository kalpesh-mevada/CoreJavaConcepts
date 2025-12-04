package UniaryOperator;

public class Post_Increment_Second {

	
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i); // 10
		
		int j = i++ + i++ + i++ + i++;		
		// i = 14
		// j = 10++ + 11++ + 12++ 13++;
		// j = 46		
		System.out.println(i); //14
		System.out.println(j); //46	
		
	}

}
