package runtime_array;
// Array setShort method Example:
import java.lang.reflect.Array;

public class First_ArraySetShort_A {

	
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 16;
		a[1] = 45;
		a[2] = 13;
		short valueOne = 11;
		short valueTwo = 12;
		//Assignment
		Array.setShort(a, 0, valueOne);
		Array.setShort(a, 1, valueTwo);
		for(int x:a){
			System.out.println(x);
		}		
	}

}
