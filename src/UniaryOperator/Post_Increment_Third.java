package UniaryOperator;

public class Post_Increment_Third {

	public static void main(String[] args) {
		int i = 10;
		int j = i++ + i++ + i++ + i++ + i++ + i++;
		// i = 16;
		// j = 10++ + 11++ + 12++ + 13++ + 14++ + 15++; = i - 16
		// j = 10+11+12+13+14+15 = 75;
		System.out.println(i); // 16
		System.out.println(j); // 75

	}

}
