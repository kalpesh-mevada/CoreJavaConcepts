package finalKeyword;
/*	If you make an array as final, its size can't 
 	be altered, but the we can re initialize 
 	array value.*/
public class Fifth_FinalArray_A {
	public static void main(String[] args) {
		final int[] a =  new int[3];
		/*	The final local variable a cannot be
		  	assigned.
		 	It must be blank and not using a compound assignment*/
		//a = new int[2]; // Error
		a[0] = 10;
		a[0] = 20; // this change value from 10 to 20.
		System.out.println(a[0]);
	}
}
