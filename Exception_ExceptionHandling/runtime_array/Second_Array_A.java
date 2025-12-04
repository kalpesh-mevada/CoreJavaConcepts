package runtime_array;
// Example with Array index out of Bound
public class Second_Array_A {
	public static void main(String[] args) {
		int[] a =  new int[3];
		a[0] = 10;
		a[1] = 100;
		a[2] = 1000;
		a[3] = 10000; // Exceeds Index
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
	}
}
