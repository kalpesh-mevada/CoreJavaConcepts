package runtime_array;
/*For Each Loop used for array only.
 * EXAMPLE*/
public class First_Array_ForEach_A {

	public static void main(String[] args) {
		 	int[] a = new int[3];
		 	a[0] = 10;
		 	a[1] = 100;
		 	a[2] = 1000;
		 	
		 	// copy data from a to x sequentially
		 	for(int x:a){
		 		System.out.println(x);
		 	}
	}
}
