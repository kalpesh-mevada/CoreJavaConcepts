package UniaryOperator;

/*
 * POST INCREMENT:
 * Increment the value by 1, when next time ahead in the program, we see the same variable.*/
public class Post_Increment_First {
		
	public static void main(String[] args) {
		// inside method local variable 
		int i = 10;
		System.out.println(i); //10
		int j = i++;
		// i++ = 10++
		// j = 10
		System.out.println(i); // 11
		System.out.println(j); // 10 
	}

}
