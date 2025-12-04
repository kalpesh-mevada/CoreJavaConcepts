package UniaryOperator;

public class Pre_Increment_Second {

		
	public static void main(String[] args) {
		int i = 10;		
		int j = ++i + ++i + ++i + ++i;
		// i = 14
		// j = ++10 : 11 + ++11 : 12 + ++12 : 13 + ++13 : 14;
		System.out.println(i); //13
		System.out.println(j+"\n"); //50
		
		int ii = 5;
		int  k = ++ii + ++ii;
		// k = ++5:6 + ++6:7; = 6+7 = 13
		System.out.println(ii); //7
		System.out.println(k); //13
	}

}
