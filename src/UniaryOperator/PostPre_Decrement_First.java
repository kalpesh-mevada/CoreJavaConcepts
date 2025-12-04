package UniaryOperator;

//POST DECREMENT
public class PostPre_Decrement_First {

	public static void main(String[] args) {
		System.out.println("PRE DECREMENT");
		int i =10;
		int j = i--;
		System.out.println(i); //output: 9
		System.out.println(j+"\n"); //output: 10
		
		System.out.println("PRE DECREMENT");
		int ii =10;
		int jj = --ii;
		System.out.println(ii); //output: 9
		System.out.println(jj+"\n"); //output: 9

	}

}
