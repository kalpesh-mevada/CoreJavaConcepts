package mianMethod;
/*Supplying value in main method*/
public class First_MainMethod_A {
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		/* if you don't supply value in args[2]
		, the it throws error as ArrayIndexOutOfBound*/
		//System.out.println(args[2]);
	}
}
