package UniaryOperator;

public class PostPre_Decrement_Second {

	
	public static void main(String[] args) {
		int i = 10;
		int j = i-- + --i + i-- + --i;
		// j = 10-- + --9:8 + 8-- + --7:6 = 10+8+8+6 =32
		System.out.println(i); // 6
		System.out.println(j); // 32
	}

}
