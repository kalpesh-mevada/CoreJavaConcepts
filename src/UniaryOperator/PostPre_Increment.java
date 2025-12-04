package UniaryOperator;

public class PostPre_Increment {

	public static void main(String[] args) {
		int i = 10;
		int j = i++ + ++i;
		// i = 12
		// j = 10++ + ++11:12;
		
		System.out.println(i); // 12
		System.out.println(j+"\n"); // 22
		
		int ii = 10;
		int jj = ii++ + ++ii + ii++ + ++ii + ii++ + ++ii + ii++ + ++ii;
		 
		// j = 10++ + ++11:12 + 12++ + ++13:14 + 14++ + ++15:16 + 16++ + ++17:18; = 10+12+12+14+14+16+16+18 = 112
		// i = 18 at last
		
		System.out.println(ii); // 18
		System.out.println(jj+"\n"); // 112
		
		
		int x = 10;
		x = x++; // x = 10++; = 10
		int y = 10;
		y = y++ + y++; // y = 10++ + 11++ = 21
		System.out.println(x);
		System.out.println(y+"\n");
		
		int z = 10;
		z = ++z + ++z; // z = ++10:11 + ++11:12 = 11+12 = 23		
		System.out.println(z);
	}
}
